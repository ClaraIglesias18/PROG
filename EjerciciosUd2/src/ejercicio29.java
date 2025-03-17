
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
public class ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe un año: ");
        int año;
        año = leer.nextInt();
        
        if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
        
            System.out.println("El año es bisiesto");
        
        } else System.out.println("El año no es bisiesto");
        
    }
    
}
