/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exepciones;
import Entidades.Correos;

/**
 *
 * @author Usuario
 */
public class ExceptionCorreo {
    
    public ExceptionCorreo(){}
    
    public void validarNombre(Correos objCorreos) throws CustomException {
        if (objCorreos.getNombre() == null || objCorreos.getNombre().trim().isEmpty()) {
            throw new CustomException("El nombre no puede estar vacío.");
        }
        if (objCorreos.getNombre() == null || objCorreos.getNombre().length() < 3 || objCorreos.getNombre().length() > 15) {
            throw new CustomException("El nombre debe tener entre 3 y 15 caracteres.");
        }
        for (char letra : objCorreos.getNombre().toCharArray()) {
            if (!Character.isLetter(letra)) {
                throw new CustomException("El nombre solo puede contener letras, sin espacios ni caracteres especiales.");
            }
        }
    }
    
    public void validarCorreo(Correos objCorreos) throws CustomException {
        if (objCorreos.getCorreo() == null || objCorreos.getCorreo().trim().isEmpty()) {
            throw new CustomException("La contraseña no puede estar vacía.");
        }
        if (objCorreos.getCorreo() == null || !objCorreos.getCorreo().contains("@")) {
            throw new CustomException("El correo debe contener un '@'.");
        }
    }
    
    public void validarAsunto(Correos objCorreos) throws CustomException {
        if (objCorreos.getAsunto() == null || objCorreos.getAsunto().trim().isEmpty()) {
            throw new CustomException("El asunto no puede estar vacío.");
        }
        if (objCorreos.getAsunto().length() < 1 || objCorreos.getAsunto().length() > 100) {
            throw new CustomException("El asunto debe tener entre 1 y 100 caracteres.");
        }
    }
    
    public void validarMensajePDF(Correos objCorreos) throws CustomException {
        if (objCorreos.getMensajePDF() == null || objCorreos.getMensajePDF().trim().isEmpty()) {
            throw new CustomException("El mensaje PDF no puede estar vacío.");
        }
        if (objCorreos.getMensajePDF().length() < 1 || objCorreos.getMensajePDF().length() > 10000) {
            throw new CustomException("El mensaje PDF debe tener entre 1 y 10,000 caracteres.");
        }
    }
    
    public void validarMensaje(Correos objCorreos) throws CustomException {
        if (objCorreos.getMensaje() == null || objCorreos.getMensaje().trim().isEmpty()) {
            throw new CustomException("El mensaje no puede estar vacío.");
        }
        if (objCorreos.getMensaje().length() < 1 || objCorreos.getMensaje().length() > 10000) {
            throw new CustomException("El mensaje debe tener entre 1 y 10,000 caracteres.");
        }
    }
}
