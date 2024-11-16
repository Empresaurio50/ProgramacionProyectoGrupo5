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
    private ArrayList empleadosLista = new ArrayList();

    public ArrayList<String[]> getEmpleadosLista() {
        return empleadosLista;
    }

    public void setEmpleadosLista(ArrayList<String[]> empleadosLista) {
        this.empleadosLista = empleadosLista;
    }
    private double salarioBruto, salarioNeto;
    
    
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

}
