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
public class LogicaDeducciones implements ServicioDeducciones{
    
    private String datosEnviar;


    private CrearEmpleadoPDF objCrearEmpleadosPDF = new CrearEmpleadoPDF();
    
    public void rebajaSalario(Deducciones objDeducciones) {
        
        

        if (objDeducciones.getSalarioBruto()> 4783000.0) {
            objDeducciones.setImpuestoRenta(objDeducciones.getSalarioBruto() * 0.25);

        }
        if ((objDeducciones.getSalarioBruto()> 2392000.0) && (objDeducciones.getSalarioBruto()<= 4783000.0)) {
            objDeducciones.setImpuestoRenta(objDeducciones.getTotalPagar() * 0.20);

        }
        if ((objDeducciones.getSalarioBruto()> 1363000.0) && (objDeducciones.getSalarioBruto()<= 2392000.0)) {
            objDeducciones.setImpuestoRenta(objDeducciones.getTotalPagar() * 0.15);

        }
        if ((objDeducciones.getSalarioBruto()> 929000.0) && (objDeducciones.getSalarioBruto()<= 1363000.0)) {
            objDeducciones.setImpuestoRenta(objDeducciones.getTotalPagar() * 0.10);
        }
        if ((objDeducciones.getSalarioBruto()<= 929000.0)) {
            objDeducciones.setImpuestoRenta(0);

        }

        objDeducciones.setCcss(objDeducciones.getSalarioBruto()* 0.10);

        objDeducciones.setAsociacionSocial(objDeducciones.getSalarioBruto()* 0.05);

        objDeducciones.setSalarioNeto((objDeducciones.getSalarioBruto() - objDeducciones.getImpuestoRenta()) - objDeducciones.getCcss() - objDeducciones.getAsociacionSocial());
    }
    
    public void datosCorreoPatrono(Deducciones objDeducciones) {
        
        rebajaSalario(objDeducciones);

        datosEnviar = objDeducciones.getNombre() + "," //0 contiene el nombre del usuario
                + objDeducciones.getCorreo() + "," //1 contiene el correo del empleado
                + objDeducciones.getMensajePDF() + "," //2 contiene el mensaje del pdf
                + objDeducciones.getAsunto() + "," //3 contiene el asunto del correo
                + objDeducciones.getMensaje()+ "," //4 contiene el mensaje del correo
                + objDeducciones.getSalarioBruto() + ","// 5 contiene el salario bruto
                + objDeducciones.getCcss()+ "," // 6 contiene el cccss del empleado
                + objDeducciones.getImpuestoRenta()+ "," // 7 impuestos sobre la rente
                + objDeducciones.getAsociacionSocial() + "," // 8 contiene la asociacionsocial
                + objDeducciones.getSalarioNeto(); // 9 contiene el salario neto
    }
    
    public void enviarCorreos(Deducciones objDeducciones) throws AddressException, SendFailedException, MessagingException, IOException {

        
        EnviarCorreo objEnviarCorreo = new EnviarCorreo();
        objEnviarCorreo.setNombrePDF(objCrearEmpleadosPDF.getNombreArchivo());
        datosCorreoPatrono(objDeducciones);
        objEnviarCorreo.setDatos(datosEnviar);
        objEnviarCorreo.EnviarCorreos();
    }
    
    public void crearPDF(Deducciones objDeducciones) throws DocumentException, FileNotFoundException {

        objCrearEmpleadosPDF = new CrearEmpleadoPDF();
        objCrearEmpleadosPDF.setNombreArchivo("Reporte Salarial.pdf");
        datosCorreoPatrono(objDeducciones);
        objCrearEmpleadosPDF.setRegistro(datosEnviar);
        objCrearEmpleadosPDF.createPDF();
    }
    
}
