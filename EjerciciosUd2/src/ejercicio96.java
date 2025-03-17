
import java.util.Random;
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
public class ejercicio96 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        Random premio = new Random();
        
        int comp;
        comp = premio.nextInt(49) + 1;
        
        int reint;
        reint = premio.nextInt(49);
        
        int combinacion[];
        combinacion = new int[6];
                        
        combinacion[0] = premio.nextInt(49) + 1;
        combinacion[1] = premio.nextInt(49) + 1;
        combinacion[2] = premio.nextInt(49) + 1;
        combinacion[3] = premio.nextInt(49) + 1;
        combinacion[4] = premio.nextInt(49) + 1;
        combinacion[5] = premio.nextInt(49) + 1;
                       
        System.out.print("La combinacion es: ");
        
        for (int i = 0; i <= 5; i++) {
            
            System.out.print(combinacion[i] + " ");
            
        }
        
        System.out.println("");
        System.out.println("Numero complementario: " + comp);
        System.out.println("Numero de reintegro: " + reint);
        
        
        
    }
    
}
