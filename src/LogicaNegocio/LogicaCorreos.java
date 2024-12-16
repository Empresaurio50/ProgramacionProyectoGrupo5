/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

import AccesoDatos.CrearEmpleadoPDF;
import AccesoDatos.EnviarCorreo;
import com.itextpdf.text.DocumentException;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.mail.MessagingException;
import javax.mail.SendFailedException;
import javax.mail.internet.AddressException;
import Entidades.Correos;
/**
 *
 * @author Empresaurio50
 */
public class LogicaCorreos implements Servicios.ServicioCorreo{
    
    private String datosEnviar;


    private CrearEmpleadoPDF objCrearPDF = new CrearEmpleadoPDF();
    
    /**
     * Prepara los datos del empleado para enviarlos por correo electrónico.
     *
     * Concatena los datos del empleado en un solo string para facilitar su
     * envío.
     *
     * @param objCorreo El objeto Empleados que contiene los datos a enviar.
     */
    public void datosCorreoPatrono(Correos objCorreo) {

        datosEnviar = objCorreo.getNombre() + "," //0 contiene el nombre del usuario
                + objCorreo.getCorreo() + "," //1 contiene el correo del empleado
                + objCorreo.getMensajePDF() + "," //2 contiene el mensaje del pdf
                + objCorreo.getAsunto() + "," //3 contiene el asunto del correo
                + objCorreo.getMensaje() //4 contiene el mensaje del correo
                + objCorreo.getTotalPagar(); // 5 contiene el salario bruto
    }

    /**
     * Envía un correo electrónico con los datos del empleado y un archivo PDF
     * adjunto.
     *
     * Crea un objeto de correo, configura los destinatarios, el asunto, el
     * cuerpo y adjunta el PDF.
     *
     * @param objCorreo El objeto Empleados que contiene los datos para el
     * correo y el archivo.
     * @throws AddressException Si ocurre un error con las direcciones de
     * correo.
     * @throws SendFailedException Si falla el envío del correo.
     * @throws MessagingException Si ocurre una excepción relacionada con el
     * correo.
     * @throws IOException Si ocurre un error al leer o escribir archivos.
     */
    public void enviarCorreos(Correos objCorreo) throws AddressException, SendFailedException, MessagingException, IOException {

        
        EnviarCorreo objEnviarCorreo = new EnviarCorreo();
        objEnviarCorreo.setNombrePDF(objCrearPDF.getNombreArchivo());
        datosCorreoPatrono(objCorreo);
        objEnviarCorreo.setDatos(datosEnviar);
        objEnviarCorreo.EnviarCorreos();
    }

    /**
     * Crea un archivo PDF con los datos del empleado.
     *
     * Genera un archivo PDF con el formato especificado y lo asigna al objeto
     * Empleados.
     *
     * @param objCorreo El objeto Empleados que contiene los datos para el
     * PDF.
     * @throws DocumentException Si ocurre un error al crear el documento PDF.
     * @throws FileNotFoundException Si no se encuentra el archivo.
     */
    public void crearPDF(Correos objCorreo) throws DocumentException, FileNotFoundException {

        objCrearPDF = new CrearEmpleadoPDF();
        objCrearPDF.setNombreArchivo("Reporte Salarial.pdf");
        datosCorreoPatrono(objCorreo);
        objCrearPDF.setRegistro(datosEnviar);
        objCrearPDF.createPDF();
    }

    
    
}
