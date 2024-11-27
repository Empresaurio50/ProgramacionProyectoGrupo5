/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicios;

import Entidades.Empleados;
import com.itextpdf.text.DocumentException;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.mail.MessagingException;
import javax.mail.SendFailedException;
import javax.mail.internet.AddressException;

/**
 *
 * @author Empresaurio50
 */
public interface ServicioEmpleado {
    
    void agregarEmpleado(Empleados objEmpleados) throws IOException;
    void leerEmpleado(Empleados objEmpleados) throws IOException;
    void eliminarEmpleado(Empleados objEmpleados) throws IOException;
    void actualizarEmpleado(Empleados objEmpleados) throws IOException;
    void enviarCorreos(Empleados objEmpleados) throws AddressException, SendFailedException, MessagingException, IOException;
    void crearPDF(Empleados objEmpleados) throws DocumentException, FileNotFoundException;
    
}
