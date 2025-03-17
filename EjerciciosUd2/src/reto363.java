
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author clara
 */
public class reto363 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int E;
        E = leer.nextInt();
        
        while (E != 0) {
    
            int comidas;
            comidas = leer.nextInt();
            
            int calorias;
            int reser = 0;
            
            for (int i = 0; i < comidas; i++) {
            
                calorias = leer.nextInt();
                reser = reser + calorias;
                
            }
            
            if (reser % E == 0) {
            
                System.out.println(reser / E);
            
            } else {
            
                System.out.println((reser / E) + 1);
            
            }
            
            E = leer .nextInt();
                       
                
        }
        
        
    }
    
}
