
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author aldar
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random genera = new Random();
        
        int[] numeros = new int[100];
        
        int repes[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        
        for (int i = 0; i < 100; i++) {
            
            int aux = 0;
            aux = genera.nextInt(50) + 20;
            numeros[i] = aux;
            
            for (int j = 21; j <= 30; j++) {
                
               if (aux == j) {
               
                   if(aux == 21) {
                   
                       repes[0] += 1; 
                       
                   }
                   if(aux == 22) {
                   
                       repes[1] += 1; 
                       
                   }
                   if(aux == 23) {
                   
                       repes[2] += 1; 
                       
                   }
                   if(aux == 24) {
                   
                       repes[3] += 1; 
                       
                   }
                   if(aux == 25) {
                   
                       repes[4] += 1; 
                       
                   }
                   if(aux == 26) {
                   
                       repes[5] += 1; 
                       
                   }
                   if(aux == 27) {
                   
                       repes[6] += 1; 
                       
                   }
                   if(aux == 28) {
                   
                       repes[7] += 1; 
                       
                   }
                   if(aux == 29) {
                   
                       repes[8] += 1; 
                       
                   }
                   if(aux == 30) {
                   
                       repes[9] += 1; 
                       
                   }
               
               }                
                
            }
            
            if (i == 20) {
            
                System.out.println(" ");
            
            }
            
            if (i == 40) {
            
                System.out.println(" ");
            
            }
            
            if (i == 60) {
            
                System.out.println(" ");
            
            }
            
            if (i == 80) {
            
                System.out.println(" ");
            
            }
            
            System.out.print(numeros[i] + " ");
        }
        
        System.out.println("");
                        
        int count = 0;
        
        for (int i = 21; i <= 30; i++) {
            
            System.out.println("El numero " + i + " aparecio " + repes[count] + " veces");
            count++;            
        }
        
        
        
        
        
    }
    
}
