
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
public class ejercicio47 {
    
     /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
                
        int num;
        num = leer.nextInt();
        
        String cadena = String.valueOf(num);
        StringBuffer rev = new StringBuffer(cadena);
        rev.reverse();
        String rever = String.valueOf(rev);
        
        if (rever.equals(cadena)) {
        
            System.out.println("El numero es capicua");
        
        } else System.out.println("El numero no es capicua");
        
    }

}
