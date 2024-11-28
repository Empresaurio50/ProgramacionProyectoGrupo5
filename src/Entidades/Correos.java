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
public class Correos extends Empleados{
    
    private String asunto, mensajePDF, mensaje;
    private ArrayList<File> archivos = new ArrayList<>();
    
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
    
    
}
