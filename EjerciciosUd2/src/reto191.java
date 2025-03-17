
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
public class reto191 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int comp, mayor, difer;
        
        int num;
        num = leer.nextInt();
        
        
        
        // restar la diferencia nº de veces como estanques tenga

        for (int i = 0; i < num; i++) {
            
            comp = leer.nextInt();
            mayor = leer.nextInt();
            difer = leer.nextInt();
            int resta = mayor;
            int suma = mayor;
            
            for (int j = 1; j < comp; j++) {
                
                resta  = resta - difer;
                suma = suma + resta;
                                                
            }
            
            System.out.println(suma);
            
        }
        
    }
    
}
