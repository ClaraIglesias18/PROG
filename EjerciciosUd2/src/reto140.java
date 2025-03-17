
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
public class reto140 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        num = leer.nextInt();
        
        while (num >= 0) {
            
            int sum = 0;
            String cifras = String.valueOf(num);
                        
            for (int i = 0; i < cifras.length(); i++) {
                
                char cif = cifras.charAt(i);
                int cif2 = Character.getNumericValue(cif);
                System.out.print(cif2);
                if (i == cifras.length() - 1) {
                
                    System.out.print(" = ");
                    
                } else System.out.print(" + ");
                sum = sum + cif2;
                                
            }
            
            System.out.print(sum);
            System.out.println("");
            num = leer.nextInt();
            
        }
        
    }
    
}
