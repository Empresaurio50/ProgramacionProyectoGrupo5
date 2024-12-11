/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;
import Entidades.Patrono;
import AccesoDatos.AccesoDatosEmpleados;
import java.io.IOException;
import Entidades.Empleados;
/**
 *
 * @author Empresaurio50
 */
public class LogicaPatrono {
    
    AccesoDatosEmpleados objAccesoDatosEmpleados = new AccesoDatosEmpleados();
    
    private String registro, nombreArchivo;
    
    
    
    public void enviarTodosCorreos(Empleados objEmpleados) throws IOException{
        
        objAccesoDatosEmpleados = new AccesoDatosEmpleados();
        
        objAccesoDatosEmpleados.setNombreArchivo(this.nombreArchivo);
        
        objAccesoDatosEmpleados.leerEmpleadoRegistro();
        
        objEmpleados.setEmpleadosLista(objAccesoDatosEmpleados.getListaEmpleados());
        
        
        
        
        for (String[] datosEmpleados : objEmpleados.getEmpleadosLista()) {
            
            String correoEmpleado;
            
            while ((correoEmpleado = datosEmpleados[3]) != null) {                
                
                
                
                
                
            }
            
            
            
        }
        
        
        
        
    }
    
    
    
    
    
    
}
