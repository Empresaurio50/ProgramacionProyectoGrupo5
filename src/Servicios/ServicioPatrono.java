/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicios;

import Entidades.Empleados;
import Entidades.Nominas;
import java.io.IOException;

/**
 *
 * @author Empresaurio50
 */
public interface ServicioPatrono {
    
    void pagoTotalEmpleados(Nominas objNominas) throws IOException;
    void enviarTodosCorreos(Empleados objEmpleados) throws IOException;
    
    
    
    
}
