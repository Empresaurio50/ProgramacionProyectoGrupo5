/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Empresaurio50
 */
public class Empleados {

    private String nombre, correo, password, asunto, mensajePDF, mensaje;
    private int id;

    private ArrayList empleadosLista = new ArrayList();

    private ArrayList<File> archivos = new ArrayList<>();

    private double salarioBruto, salarioNeto;

    /**
     * Obtiene el salario bruto (sin descuentos) de un empleado.
     *
     * @return El salario bruto como un valor double.
     */
    public double getSalarioBruto() {
        return salarioBruto;
    }

    /**
     * Establece el salario bruto (sin descuentos) de un empleado.
     *
     * @param salarioBruto El nuevo salario bruto del empleado como un valor
     * double.
     */
    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    /**
     * Obtiene el salario neto (con descuentos aplicados) de un empleado.
     *
     * @return El salario neto como un valor double.
     *
     * @ lưu ý: Esta función no está implementada en el código proporcionado.
     * Deberá implementarla para calcular el salario neto en base al salario
     * bruto y cualquier descuento aplicable.
     */
    public double getSalarioNeto() {
        return salarioNeto;
    }

    /**
     * Establece el salario neto (con descuentos aplicados) de un empleado.
     *
     * @param salarioNeto El nuevo salario neto del empleado como un valor
     * double.
     *
     * @ lưu ý: Esta función puede ser útil si se calcula el salario neto en
     * otro lugar y se desea establecerlo directamente. Sin embargo, es más
     * común calcular el salario neto en el método `getSalarioNeto`.
     */
    public void setSalarioNeto(double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }

    /**
     * Obtiene una lista de empleados.
     *
     * Esta función devuelve una lista que contiene información sobre los
     * empleados. El formato exacto de la información en la lista puede variar
     * dependiendo de cómo esté implementada la clase.
     *
     * @return Una lista de empleados.
     */
    public ArrayList<String[]> getEmpleadosLista() {
        return empleadosLista;
    }

    /**
     * Establece la lista de empleados en un formato específico (posiblemente
     * una lista de arreglos de cadenas de caracteres).
     *
     * @param empleadosLista La nueva lista de empleados como un objeto
     * `ArrayList<String[]>`.
     */
    public void setEmpleadosLista(ArrayList<String[]> empleadosLista) {
        this.empleadosLista = empleadosLista;
    }

    /**
     * Obtiene el nombre de un empleado.
     *
     * @return El nombre del empleado como una cadena de caracteres.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de un empleado.
     *
     * @param nombre El nuevo nombre del empleado como una cadena de caracteres.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el correo electrónico de un empleado.
     *
     * @return El correo electrónico del empleado como una cadena de caracteres.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo electrónico de un empleado.
     *
     * @param correo El nuevo correo electrónico del empleado como una cadena de
     * caracteres.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene la contraseña de un empleado (se recomienda almacenar contraseñas
     * de forma segura).
     *
     * @return La contraseña del empleado como una cadena de caracteres.
     *
     * @aviso: Almacenar contraseñas en texto plano es una mala práctica de
     * seguridad. Se deben utilizar técnicas como el hash y el salazón para
     * proteger las contraseñas.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Establece la contraseña de un empleado (se recomienda almacenar
     * contraseñas de forma segura).
     *
     * @param password La nueva contraseña del empleado como una cadena de
     * caracteres.
     *
     * @aviso: Almacenar contraseñas en texto plano es una mala práctica de
     * seguridad. Se deben utilizar técnicas como el hash y el salazón para
     * proteger las contraseñas.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Obtiene el asunto de un mensaje (posiblemente relacionado con un correo
     * electrónico o un informe).
     *
     * @return El asunto del mensaje como una cadena de caracteres.
     */
    public String getAsunto() {
        return asunto;
    }

    /**
     * Establece el asunto de un mensaje (posiblemente relacionado con un correo
     * electrónico o un informe).
     *
     * @param asunto El nuevo asunto del mensaje como una cadena de caracteres.
     */
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    /**
     * Obtiene el contenido de un mensaje en formato PDF.
     *
     * @return El contenido del mensaje en formato PDF como una cadena de texto.
     */
    public String getMensajePDF() {
        return mensajePDF;
    }

    /**
     * Establece el contenido de un mensaje en formato PDF.
     *
     * @param mensajePDF El nuevo contenido del mensaje en formato PDF.
     */
    public void setMensajePDF(String mensajePDF) {
        this.mensajePDF = mensajePDF;
    }

    /**
     * Obtiene una lista de archivos asociados a este objeto.
     *
     * @return Una lista de archivos.
     */
    public ArrayList<File> getArchivos() {
        return archivos;
    }

    /**
     * Agrega un archivo a la lista de archivos asociados.
     *
     * @param archivos El archivo a agregar.
     */
    public void setArchivos(File archivos) {
        this.archivos.add(archivos);
    }

    /**
     * Obtiene el contenido de un mensaje.
     *
     * @return El contenido del mensaje como una cadena de texto.
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Establece el contenido de un mensaje.
     *
     * @param mensaje El nuevo contenido del mensaje.
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * Obtiene el identificador único de este objeto.
     *
     * @return El identificador único como un número entero.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador único de este objeto.
     *
     * @param id El nuevo identificador único.
     */
    public void setId(int id) {
        this.id = id;
    }

}
