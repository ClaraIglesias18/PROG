
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
public class reto267 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int ancho, largo, maximo;
        
        ancho = leer.nextInt();
        largo = leer.nextInt();
        maximo = leer.nextInt();
        
        while (ancho != 0 || largo != 0 || maximo != 0) {
        
            int postesw = 0;
            
            if (ancho < maximo) {
                
                postesw = 2;
            
            } else if (ancho % maximo != 0) {
            
                postesw = (ancho / maximo * 2) + 2;
            
            } else {
            
                postesw = ancho / maximo * 2;
            
            }
            
            int postesh = 0;
            
            if (largo < maximo) {
                
                postesh = 2;
            
            } else if (largo % maximo != 0) {
            
                postesh = (largo / maximo * 2) + 2;
            
            } else {
            
                postesh = largo / maximo * 2;
            
            }
            
            System.out.println(postesh + postesw);
            
            ancho = leer.nextInt();
            largo = leer.nextInt();
            maximo = leer.nextInt();
        }
        
    }
    
}
