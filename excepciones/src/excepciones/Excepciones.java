/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dual109
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num = 0;
        int den = 0;
       
                       
        while (num != -1 || den != -1) {
        
            try {               
                
                System.out.println("Indique el numerador de la division: ");
                num = leer.nextInt();
        
                System.out.println("Indique el denominador de la division: ");
                den = leer.nextInt();
                
                int resultado = num / den;
                System.out.println(num + "/" + den + " = " + resultado);
            
            }
            
            catch (ArithmeticException exc) {
                
                System.out.println("ERROR calculando: " + exc.getMessage());
                        
            }
            
            catch (InputMismatchException exc) {
                
                leer.nextLine(); 
                System.out.println("ERROR numero: " + exc.getMessage());
            
            }
            
            finally {
            
                System.out.println("La operacion solicitada fue: " + num + "/" + den );
            
            }
                                  
            
                   
        }
        
    }
    
}
