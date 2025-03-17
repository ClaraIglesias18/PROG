/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio114;

/**
 *
 * @author jnieto
 */
public class OutOfRangeException extends Exception {

    public OutOfRangeException() {
       
        super("Los valores están fuera del rango adecuado. ");
        
    }

    public OutOfRangeException(String message) {
        super(message);
    }
    
    
}
