
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
public class ejercicio41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        int num, mayor, menor;
                
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe 5 numeros: ");
        num = leer.nextInt();
        
        while (num < 0) {
        
            System.out.println("ERROR, numero negativo");
            num = leer.nextInt();
        
        }
        
        mayor = num;
        menor = num;
        
        for (int i = 0; i < 4; i++) {
        
            num = leer.nextInt();
            
            if (num > mayor) {
                
                mayor = num;
            
            } else if (num < menor) {
            
                menor = num;
            
            }
        
        }
        
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
        
        }
    
    }