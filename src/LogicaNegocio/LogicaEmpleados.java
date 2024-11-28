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

    public void datosRegistro(Empleados objEmpleados){
        String registro = objEmpleados.getId() + ","
                + objEmpleados.getNombre() + ","
                + objEmpleados.getPassword() + ","
                + objEmpleados.getCorreo() + ","
                + objEmpleados.getSalarioBruto();
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

        int id = objServicioIdControl.getNextId(objAccesoDatosEmpleados.getNombreArchivo());

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

        String registro = objEmpleados.getId() + ","
                + objEmpleados.getNombre() + ","
                + objEmpleados.getPassword() + ","
                + objEmpleados.getCorreo() + ","
                + objEmpleados.getSalarioBruto();
        
        objAccesoDatosEmpleados.setRegistro(registro);
        objAccesoDatosEmpleados.actualizarEmpleadoRegistro(objEmpleados.getId());

    }

    /**
     * Prepara los datos del empleado para enviarlos por correo electrónico.
     *
     * Concatena los datos del empleado en un solo string para facilitar su
     * envío.
     *
     * @param objEmpleados El objeto Empleados que contiene los datos a enviar.
     */
    public void datosCorreo(Empleados objEmpleados) {

        datosEnviar = objEmpleados.getNombre() + "," //0 contiene el nombre del usuario
                + objEmpleados.getCorreo() + "," //1 contiene el correo del empleado
                + objEmpleados.getMensajePDF() + "," //2 contiene el mensaje del pdf
                + objEmpleados.getAsunto() + "," //3 contiene el asunto del correo
                + objEmpleados.getMensaje(); //4 contiene el mensaje del correo
    }

    /**
     * Envía un correo electrónico con los datos del empleado y un archivo PDF
     * adjunto.
     *
     * Crea un objeto de correo, configura los destinatarios, el asunto, el
     * cuerpo y adjunta el PDF.
     *
     * @param objEmpleados El objeto Empleados que contiene los datos para el
     * correo y el archivo.
     * @throws AddressException Si ocurre un error con las direcciones de
     * correo.
     * @throws SendFailedException Si falla el envío del correo.
     * @throws MessagingException Si ocurre una excepción relacionada con el
     * correo.
     * @throws IOException Si ocurre un error al leer o escribir archivos.
     */
    public void enviarCorreos(Empleados objEmpleados) throws AddressException, SendFailedException, MessagingException, IOException {

        CrearPDF objCrearPDF = new CrearPDF();
        EnviarCorreo objCorreo = new EnviarCorreo();
        objCorreo.setArchivosPDF(objCrearPDF.getArchivos());
        datosCorreo(objEmpleados);
        objCorreo.setDatos(datosEnviar);
        objCorreo.EnviarCorreos();
    }

    /**
     * Crea un archivo PDF con los datos del empleado.
     *
     * Genera un archivo PDF con el formato especificado y lo asigna al objeto
     * Empleados.
     *
     * @param objEmpleados El objeto Empleados que contiene los datos para el
     * PDF.
     * @throws DocumentException Si ocurre un error al crear el documento PDF.
     * @throws FileNotFoundException Si no se encuentra el archivo.
     */
    public void crearPDF(Empleados objEmpleados) throws DocumentException, FileNotFoundException {

        CrearPDF objCrearPDF = new CrearPDF();
        objCrearPDF.setNombreArchivo("Tarea1.pdf");
        datosCorreo(objEmpleados);
        objCrearPDF.setRegistro(datosEnviar);
        objEmpleados.setArchivos(new File(objCrearPDF.getNombreArchivo()));
        objCrearPDF.createPDF();
    }

}
