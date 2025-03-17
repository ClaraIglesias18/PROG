
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dual109
 */
public class ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escriba un numero: ");
        double numero;
        numero = leer.nextDouble();
        
        if (numero > 0 ) {
        
            System.out.println("El numero es positivo");
            
        } else if ( numero < 0){ 
            System.out.println("El numero es negativo");
                
        } else System.out.println("El numero es 0");
    }
    
}
