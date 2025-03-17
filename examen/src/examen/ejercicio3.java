/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;
import javax.management.StringValueExp;

/**
 *
 * @author dual109
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        String prim;
        System.out.println("Primera palabra: ");
        prim = leer.nextLine();
        
        String seg;
        System.out.println("Segunda palabra: ");
        seg = leer.nextLine();
                        
        boolean anagrama = false;
        
        int comprobar = 0;
        
        if (prim.length() == seg.length()) {
            
            for (int i = 0; i < prim.length(); i++) {
                
                char letra = seg.charAt(i);
                String letraString = String.valueOf(letra);
                
                if(prim.contains(letraString)) {
                
                    comprobar++;
                
                }
                                                
            }
                          
        }
        
        if (comprobar == prim.length()) {
        
            anagrama = true;
        
        }
                
        System.out.println(anagrama);
            
                     
               
               
    }
    
}
