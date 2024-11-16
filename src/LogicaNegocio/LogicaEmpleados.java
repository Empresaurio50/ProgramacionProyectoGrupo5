/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

import AccesoDatos.AccesoDatosEmpleados;
import AccesoDatos.IdControl;
import Entidades.Empleados;
import java.io.IOException;
import Servicios.ServicioEmpleado;
import Servicios.ServicioIdControl;


/**
 *
 * @author Empresaurio50
 */
public class LogicaEmpleados implements ServicioEmpleado {
    
    

    private static AccesoDatosEmpleados objAccesoDatosEmpleados;
    private static ServicioIdControl objServicioIdControl;
    

    public LogicaEmpleados()throws IOException{
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

}
