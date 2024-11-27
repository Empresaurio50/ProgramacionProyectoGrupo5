/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

import AccesoDatos.AccesoDatosEmpleados;
import AccesoDatos.CrearPDF;
import AccesoDatos.EnviarCorreo;
import AccesoDatos.IdControl;
import Entidades.Empleados;
import java.io.IOException;
import Servicios.ServicioEmpleado;
import Servicios.ServicioIdControl;
import com.itextpdf.text.DocumentException;
import java.io.File;
import java.io.FileNotFoundException;
import javax.mail.MessagingException;
import javax.mail.SendFailedException;
import javax.mail.internet.AddressException;

/**
 *
 * @author Empresaurio50
 */
public class LogicaEmpleados implements ServicioEmpleado {

    private static AccesoDatosEmpleados objAccesoDatosEmpleados;
    private static ServicioIdControl objServicioIdControl;
    private String datosEnviar;

    public LogicaEmpleados() throws IOException {
        this.objServicioIdControl = new IdControl();

    }

    @Override
    public void agregarEmpleado(Empleados objEmpleados) throws IOException {

        objAccesoDatosEmpleados = new AccesoDatosEmpleados();

        objAccesoDatosEmpleados.setNombreArchivo("ListaEmpleados.txt");

        int id = objServicioIdControl.getNextId(objAccesoDatosEmpleados.getNombreArchivo());

        objEmpleados.setId(id);
        String registro = objEmpleados.getId() + ","
                + objEmpleados.getNombre() + ","
                + objEmpleados.getPassword() + ","
                + objEmpleados.getCorreo();

        objAccesoDatosEmpleados.setRegistro(registro);

        objAccesoDatosEmpleados.agregarEmpleadoRegistro();

    }

    @Override
    public void leerEmpleado(Empleados objEmpleados) throws IOException {

        objAccesoDatosEmpleados = new AccesoDatosEmpleados();

        objAccesoDatosEmpleados.setNombreArchivo("ListaEmpleados.txt");

        objAccesoDatosEmpleados.leerEmpleadoRegistro();

        objEmpleados.setEmpleadosLista(objAccesoDatosEmpleados.getListaEmpleados());

    }

    @Override
    public void eliminarEmpleado(Empleados objEmpleados) throws IOException {

        objAccesoDatosEmpleados = new AccesoDatosEmpleados();

        objAccesoDatosEmpleados.setNombreArchivo("ListaEmpleados.txt");

        objAccesoDatosEmpleados.eliminarEmpleadoRegistro(objEmpleados.getId());

    }

    @Override
    public void actualizarEmpleado(Empleados objEmpleados) throws IOException {

        objAccesoDatosEmpleados = new AccesoDatosEmpleados();

        objAccesoDatosEmpleados.setNombreArchivo("ListaEmpleados.txt");

        String registro = objEmpleados.getId() + "," + objEmpleados.getNombre() + "," + objEmpleados.getPassword() + "," + objEmpleados.getCorreo();

        objAccesoDatosEmpleados.setRegistro(registro);

        objAccesoDatosEmpleados.actualizarEmpleadoRegistro(objEmpleados.getId());

    }
    
    
    
    public void datosUsuario(Empleados objEmpleados){
        
         datosEnviar = objEmpleados.getNombre()+ "," //0 contiene el nombre del usuario
                + objEmpleados.getCorreo()+ "," //1 contiene el apellido del empleado
                + objEmpleados.getMensajePDF() + "," //2 contiene el mensaje del pdf
                + objEmpleados.getCorreo()+ "," //3 contiene el correo del empleado
                + objEmpleados.getAsunto() + "," //4 contiene el asunto del correo
                + objEmpleados.getMensaje(); //5 contiene el mensaje del correo
    }
    
   public void enviarCorreos(Empleados objEmpleados) throws AddressException, SendFailedException, MessagingException, IOException {

        EnviarCorreo objCorreo = new EnviarCorreo();
        objCorreo.setArchivos(objEmpleados.getArchivos());
        datosUsuario(objEmpleados);
        objCorreo.setDatos(datosEnviar);
        objCorreo.EnviarCorreos();
    } 
   
   public void crearPDF(Empleados objEmpleados) throws DocumentException, FileNotFoundException {
        
        CrearPDF objCrearPDF = new CrearPDF();
        objCrearPDF.setNombreArchivo("Tarea1.pdf");
        datosUsuario(objEmpleados);
        objCrearPDF.setRegistro(datosEnviar);
        objEmpleados.setArchivos(new File(objCrearPDF.getNombreArchivo()));
        objCrearPDF.createPDF();
    }
    

}
