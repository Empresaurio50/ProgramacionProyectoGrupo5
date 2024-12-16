/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

import AccesoDatos.CrearEmpleadoPDF;
import AccesoDatos.EnviarCorreo;
import Entidades.Correos;
import Entidades.Deducciones;
import com.itextpdf.text.DocumentException;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.mail.MessagingException;
import javax.mail.SendFailedException;
import javax.mail.internet.AddressException;
import Servicios.ServicioDeducciones;

/**
 *
 * @author Empresaurio50
 */
public class LogicaDeducciones implements ServicioDeducciones {

    private String datosEnviar;

    private CrearEmpleadoPDF objCrearEmpleadosPDF = new CrearEmpleadoPDF();

    /**
     * Calcula las deducciones del salario bruto y establece el salario neto.
     *
     * Este método aplica las deducciones de la CCSS, impuesto sobre la renta y
     * la asociación social según el salario bruto, y luego establece el salario
     * neto en el objeto Deducciones.
     *
     * @param objDeducciones El objeto Deducciones que contiene la información
     * del salario.
     */
    public void rebajaSalario(Deducciones objDeducciones) {
        if (objDeducciones.getSalarioBruto() > 4783000.0) {
            objDeducciones.setImpuestoRenta(objDeducciones.getSalarioBruto() * 0.25);
        } else if (objDeducciones.getSalarioBruto() > 2392000.0) {
            objDeducciones.setImpuestoRenta(objDeducciones.getTotalPagar() * 0.20);
        } else if (objDeducciones.getSalarioBruto() > 1363000.0) {
            objDeducciones.setImpuestoRenta(objDeducciones.getTotalPagar() * 0.15);
        } else if (objDeducciones.getSalarioBruto() > 929000.0) {
            objDeducciones.setImpuestoRenta(objDeducciones.getTotalPagar() * 0.10);
        } else {
            objDeducciones.setImpuestoRenta(0);
        }

        objDeducciones.setCcss(objDeducciones.getSalarioBruto() * 0.10);
        objDeducciones.setAsociacionSocial(objDeducciones.getSalarioBruto() * 0.05);
        objDeducciones.setSalarioNeto((objDeducciones.getSalarioBruto() - objDeducciones.getImpuestoRenta()) - objDeducciones.getCcss() - objDeducciones.getAsociacionSocial());
    }

    /**
     * Prepara los datos necesarios para enviar un correo del patrono.
     *
     * Este método calcula las deducciones del salario y prepara una cadena con
     * los datos necesarios para el envío del correo.
     *
     * @param objDeducciones El objeto Deducciones que contiene la información
     * del salario.
     */
    public void datosCorreoPatrono(Deducciones objDeducciones) {
        rebajaSalario(objDeducciones);

        datosEnviar = objDeducciones.getNombre() + "," // 0 contiene el nombre del usuario
                + objDeducciones.getCorreo() + "," // 1 contiene el correo del empleado
                + objDeducciones.getMensajePDF() + "," // 2 contiene el mensaje del PDF
                + objDeducciones.getAsunto() + "," // 3 contiene el asunto del correo
                + objDeducciones.getMensaje() + "," // 4 contiene el mensaje del correo
                + objDeducciones.getSalarioBruto() + "," // 5 contiene el salario bruto
                + objDeducciones.getCcss() + "," // 6 contiene la CCSS del empleado
                + objDeducciones.getImpuestoRenta() + "," // 7 contiene el impuesto sobre la renta
                + objDeducciones.getAsociacionSocial() + "," // 8 contiene la asociación social
                + objDeducciones.getSalarioNeto(); // 9 contiene el salario neto
    }

    /**
     * Envía correos electrónicos con un archivo PDF adjunto.
     *
     * Este método prepara los datos del correo y utiliza el objeto EnviarCorreo
     * para enviar el correo electrónico con el archivo PDF adjunto.
     *
     * @param objDeducciones El objeto Deducciones que contiene la información
     * del salario.
     * @throws AddressException Si la dirección del correo es incorrecta.
     * @throws SendFailedException Si ocurre un error al enviar el correo.
     * @throws MessagingException Si ocurre un error con el sistema de
     * mensajería.
     * @throws IOException Si ocurre un error de entrada/salida.
     */
    public void enviarCorreos(Deducciones objDeducciones) throws AddressException, SendFailedException, MessagingException, IOException {
        EnviarCorreo objEnviarCorreo = new EnviarCorreo();
        objEnviarCorreo.setNombrePDF(objCrearEmpleadosPDF.getNombreArchivo());
        datosCorreoPatrono(objDeducciones);
        objEnviarCorreo.setDatos(datosEnviar);
        objEnviarCorreo.EnviarCorreos();
    }

    /**
     * Crea un archivo PDF con los datos de las deducciones del salario.
     *
     * Este método prepara los datos necesarios y utiliza el objeto
     * CrearEmpleadoPDF para generar un archivo PDF con el reporte salarial.
     *
     * @param objDeducciones El objeto Deducciones que contiene la información
     * del salario.
     * @throws DocumentException Si ocurre un error al crear el documento.
     * @throws FileNotFoundException Si no se encuentra el archivo especificado.
     */
    public void crearPDF(Deducciones objDeducciones) throws DocumentException, FileNotFoundException {
        objCrearEmpleadosPDF = new CrearEmpleadoPDF();
        objCrearEmpleadosPDF.setNombreArchivo("Reporte Salarial.pdf");
        datosCorreoPatrono(objDeducciones);
        objCrearEmpleadosPDF.setRegistro(datosEnviar);
        objCrearEmpleadosPDF.createPDF();
    }

}
