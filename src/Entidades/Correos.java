/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Empresaurio50
 */
public class Correos extends Empleados{
    
    private String asunto, mensajePDF, mensaje;
    
    
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
