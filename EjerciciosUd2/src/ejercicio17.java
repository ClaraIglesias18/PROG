
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
public class ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escribe un numero: ");
        int num1;
        num1 = leer.nextInt();
        
        System.out.println("Escribe otro numero: ");
        int num2;
        num2 = leer.nextInt();
        
        System.out.println("Numeros introducidos: " + num1 + " " + num2);
        
        if (num1 >= 0 && num2 >= 0) {
        
                int suma;
                suma = num1 + num2;
                System.out.println("La suma de los dos numeros es: " + suma);
            
        } else System.out.println("Los numeros no se pueden sumar");
        
        
        
    }
    
}
