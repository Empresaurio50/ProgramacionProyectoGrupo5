/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exepciones;

/**
 *
 * @author Usuario
 */
public class CustomException extends Exception{
    
    public static final long serialVersionUID = 700L;//esto es para asegurarse que sirva
    
    public CustomException(){
        
        
        
    }
    
    
    public CustomException(String mensaje){
        
        super(mensaje);
    
    }
    
}