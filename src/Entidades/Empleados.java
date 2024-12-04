/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Empresaurio50
 */
public class Empleados {

    private String nombre, correo, password;
    private int id;
    private double salarioBruto, salarioNeto, seguro, impuestoRenta, aportesPatronales;
    private ArrayList empleadosLista = new ArrayList();
    private boolean verificacion;
    
    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    public double getImpuestoRenta() {
        return impuestoRenta;
    }

    public void setImpuestoRenta(double impuestoRenta) {
        this.impuestoRenta = impuestoRenta;
    }

    public double getAportesPatronales() {
        return aportesPatronales;
    }

    public void setAportesPatronales(double aportesPatronales) {
        this.aportesPatronales = aportesPatronales;
    }


    
    
    
    public boolean isVerificacion() {
        return verificacion;
    }

    public void setVerificacion(boolean verificacion) {
        this.verificacion = verificacion;
    }
    
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
     * Esta función no está implementada en el código proporcionado.
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
     * Esta función puede ser útil si se calcula el salario neto en
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
     * Obtiene la contraseña de un empleado.
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
     * Establece la contraseña de un empleado.
     *
     * @param password La nueva contraseña del empleado como una cadena de
     * caracteres.
     *
     * 
     */
    public void setPassword(String password) {
        this.password = password;
    }

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
