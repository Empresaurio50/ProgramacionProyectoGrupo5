/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exepciones;
import Entidades.Empleados;

/**
 *
 * @author Usuario
 */
public class ExceptionEmpleado {

    public ExceptionEmpleado() {
    }

    //validar el nombre que tenga minimo de letras y menos del maximo
    public void validarNombre(Empleados objEmpleados) throws CustomException {
        if (objEmpleados.getNombre() == null || objEmpleados.getNombre().trim().isEmpty()) {
            throw new CustomException("El nombre no puede estar vacío.");
        }
        if (objEmpleados.getNombre()== null || objEmpleados.getNombre().length() < 3 || objEmpleados.getNombre().length() > 15) {
            throw new CustomException("El nombre debe tener entre 3 y 15 caracteres.");
        }
        for (char letra : objEmpleados.getNombre().toCharArray()) {
            if (!Character.isLetter(letra)) {
                throw new CustomException("El nombre solo puede contener letras, sin espacios ni caracteres especiales.");
            }
        }
    }

    //validar que el correo tenga un arroba
    public void validarCorreo(String correo) throws CustomException {
        if (correo == null || correo.trim().isEmpty()) {
            throw new CustomException("La contraseña no puede estar vacía.");
        }
        if (correo == null || !correo.contains("@")) {
            throw new CustomException("El correo debe contener un '@'.");
        }
    }
    
}