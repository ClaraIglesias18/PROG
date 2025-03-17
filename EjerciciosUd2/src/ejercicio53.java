
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
public class ejercicio53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int num1;
        int num2;
        int sumapar = 0;
        int sumaimpar = 0;
        
        num1 = leer.nextInt();
        
        while (num1 < 0) {
            
            System.out.println("El numero tiene que ser positivo");
            num1 = leer.nextInt();
        
        }
        
        num2 = leer.nextInt();
        
        while (num2 < 0) {
        
            System.out.println("El numero tiene que ser positivo");
            num2 = leer.nextInt();
            
        }
        
        int mayor = Math.max(num1, num2);
        int menor = Math.min(num1, num2);
        
        for (int i = menor + 1; i < mayor; i++) {
            
            if (i % 2 == 0) {
            
                sumapar = sumapar + i;
            
            } else {
            
                sumaimpar = sumaimpar + i;
            
            }
            
                        
        }
        
        System.out.println("suma pares: " + sumaimpar);
        System.out.println("suma impares: " + sumapar);
        
        
        
        
    }
    
}
