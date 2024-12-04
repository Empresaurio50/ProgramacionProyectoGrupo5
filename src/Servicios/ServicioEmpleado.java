/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicios;

import Entidades.Empleados;
import java.io.IOException;

/**
 *
 * @author Empresaurio50
 */
public interface ServicioEmpleado {
    
    void agregarEmpleado(Empleados objEmpleados) throws IOException;
    void leerEmpleado(Empleados objEmpleados) throws IOException;
    void eliminarEmpleado(Empleados objEmpleados) throws IOException;
    void actualizarEmpleado(Empleados objEmpleados) throws IOException;
    void verificarEmpleado(Empleados objEmpleados) throws IOException;
    
    
}
