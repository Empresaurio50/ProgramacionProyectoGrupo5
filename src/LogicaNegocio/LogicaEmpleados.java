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

    public LogicaEmpleados() throws IOException {
        this.objServicioIdControl = new IdControl();

    }

    /**
     * Registra los datos de un empleado.
     *
     * Este método toma un objeto Empleados y construye una cadena que
     * representa los datos del empleado, separándolos por comas. Luego,
     * almacena esta cadena en el acceso de datos de empleados.
     *
     * @param objEmpleados El objeto Empleados cuyos datos se desean registrar.
     */
    public void datosRegistro(Empleados objEmpleados) {
        // Construye la cadena de registro con los datos del empleado.
        String registro = objEmpleados.getId() + "," // 0
                + objEmpleados.getNombre() + "," // 1
                + objEmpleados.getPassword() + "," // 2
                + objEmpleados.getCorreo() + "," // 3
                + objEmpleados.getTotalPagar(); // 4
        // Guarda la cadena de registro en el acceso de datos de empleados.
        objAccesoDatosEmpleados.setRegistro(registro);
    }

    /**
     * Agrega un nuevo empleado a la lista de empleados.
     *
     * Este método toma un objeto de tipo Empleados como parámetro, asigna un ID
     * único al empleado, crea un registro en formato CSV y lo agrega al archivo
     * de texto especificado.
     *
     * @param objEmpleados El objeto Empleados que contiene los datos del nuevo
     * empleado.
     * @throws IOException Si ocurre un error al escribir en el archivo.
     */
    @Override
    public void agregarEmpleado(Empleados objEmpleados) throws IOException {

        objAccesoDatosEmpleados = new AccesoDatosEmpleados();

        objAccesoDatosEmpleados.setNombreArchivo("ListaEmpleados.txt");

        int id = objServicioIdControl.siguienteId(objAccesoDatosEmpleados.getNombreArchivo());

        objEmpleados.setId(id);
        datosRegistro(objEmpleados);
        objAccesoDatosEmpleados.agregarEmpleadoRegistro();
    }

    /**
     * Lee todos los empleados de la lista y los asigna al objeto pasado como
     * parámetro.
     *
     * Este método lee el archivo de texto especificado, parsea cada línea para
     * obtener los datos de los empleados y los almacena en una lista interna.
     * Finalmente, asigna esta lista al atributo empleadosLista del objeto
     * Empleados pasado como parámetro.
     *
     * @param objEmpleados El objeto Empleados al que se le asignarán los
     * empleados leídos.
     * @throws IOException Si ocurre un error al leer el archivo.
     */
    @Override
    public void leerEmpleado(Empleados objEmpleados) throws IOException {

        objAccesoDatosEmpleados = new AccesoDatosEmpleados();

        objAccesoDatosEmpleados.setNombreArchivo("ListaEmpleados.txt");

        objAccesoDatosEmpleados.leerEmpleadoRegistro();

        objEmpleados.setEmpleadosLista(objAccesoDatosEmpleados.getListaEmpleados());

    }

    /**
     * Elimina un empleado de la lista de empleados.
     *
     * Busca al empleado por su ID y lo elimina del archivo de empleados.
     *
     * @param objEmpleados El objeto Empleados que contiene el ID del empleado a
     * eliminar.
     * @throws IOException Si ocurre un error al escribir en el archivo.
     */
    @Override
    public void eliminarEmpleado(Empleados objEmpleados) throws IOException {

        objAccesoDatosEmpleados = new AccesoDatosEmpleados();

        objAccesoDatosEmpleados.setNombreArchivo("ListaEmpleados.txt");

        objAccesoDatosEmpleados.eliminarEmpleadoRegistro(objEmpleados.getId());

    }

    /**
     * Actualiza los datos de un empleado en la lista.
     *
     * Busca al empleado por su ID y reemplaza su registro con los nuevos datos.
     *
     * @param objEmpleados El objeto Empleados con los datos actualizados.
     * @throws IOException Si ocurre un error al escribir en el archivo.
     */
    @Override
    public void actualizarEmpleado(Empleados objEmpleados) throws IOException {

        objAccesoDatosEmpleados = new AccesoDatosEmpleados();

        objAccesoDatosEmpleados.setNombreArchivo("ListaEmpleados.txt");

        datosRegistro(objEmpleados);

        objAccesoDatosEmpleados.actualizarEmpleadoRegistro(objEmpleados.getId());

    }

/**
 * Verifica los datos de un empleado.
 * 
 * Este método utiliza un objeto `Empleados` para obtener los datos del empleado,
 * y luego llama al método de verificación en `AccesoDatosEmpleados` para comprobar 
 * las credenciales del empleado contra un archivo de datos.
 * 
 * @param objEmpleados El objeto `Empleados` que contiene los datos del empleado.
 * @throws IOException Si ocurre un error durante la lectura del archivo.
 */
public void verificarEmpleado(Empleados objEmpleados) throws IOException {
    objAccesoDatosEmpleados = new AccesoDatosEmpleados(); // Inicializa el objeto de acceso a datos de empleados.

    objAccesoDatosEmpleados.setNombreArchivo("ListaEmpleados.txt"); // Establece el nombre del archivo de empleados.

    objAccesoDatosEmpleados.setBuscarCorreo(objEmpleados.getCorreo()); // Establece el correo a buscar.
    objAccesoDatosEmpleados.setBuscarPassword(objEmpleados.getPassword()); // Establece la contraseña a buscar.

    objAccesoDatosEmpleados.verificarEmpleado(); // Verifica los datos del empleado.

    objEmpleados.setVerificacion(objAccesoDatosEmpleados.getVerificacion()); // Establece el resultado de la verificación.
}


}
