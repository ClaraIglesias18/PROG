
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
public class reto538 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int abuelo;
        int iglesia;
        
        Scanner leer = new Scanner(System.in); 
        
        abuelo = leer.nextInt();
        iglesia = leer.nextInt();
        
        while (abuelo != 0 || iglesia != 0) {
        
            if (abuelo < iglesia) {
            
                System.out.println("SENIL");
            
            } else System.out.println("CUERDO");
           
            abuelo = leer.nextInt();
            iglesia = leer.nextInt();
        }
        
    }
    
}
