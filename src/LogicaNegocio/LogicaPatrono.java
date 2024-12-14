/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

import Entidades.Patrono;
import AccesoDatos.AccesoDatosEmpleados;
import java.io.IOException;
import Entidades.Empleados;
import Entidades.Patrono;
import Servicios.ServicioPatrono;

/**
 *
 * @author Empresaurio50
 */
public class LogicaPatrono implements ServicioPatrono{

    AccesoDatosEmpleados objAccesoDatosEmpleados = new AccesoDatosEmpleados();

    private String registro, nombreArchivo = "ListaEmpleados.txt";

    public void enviarTodosCorreos(Empleados objEmpleados) throws IOException {

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

    public void pagoTotalEmpleados(Patrono objPatrono) throws IOException {

        objPatrono = new Patrono();
        
        objAccesoDatosEmpleados.setNombreArchivo(this.nombreArchivo);

        objAccesoDatosEmpleados.leerEmpleadoRegistro();
        
        double totalPagar = 0;

        for (String[] datosPatrono : objPatrono.getEmpleadosLista()) {

            totalPagar = totalPagar + Double.parseDouble(datosPatrono[4]);

        }

        objPatrono.setTotalPagar(totalPagar);
    }

}
