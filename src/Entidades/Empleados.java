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
    

    public ArrayList<String[]> getEmpleadosLista() {
        return empleadosLista;
    }

    public void setEmpleadosLista(ArrayList<String[]> empleadosLista) {
        this.empleadosLista = empleadosLista;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensajePDF() {
        return mensajePDF;
    }

    public void setMensajePDF(String mensajePDF) {
        this.mensajePDF = mensajePDF;
    }

    public ArrayList<File> getArchivos() {
        return archivos;
    }

    public void setArchivos(File archivos) {
        this.archivos.add(archivos);
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

}
