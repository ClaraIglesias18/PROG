
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author clara
 */
public class ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escriba el numero 1: ");
        int num1;
        num1 = leer.nextInt();
        
        System.out.println("Escriba el numero 2: ");
        int num2;
        num2 = leer.nextInt();
        
        if (num1 < 0 && num2 < 0) {
        
            System.out.println("Los dos numeros son negativos");
            
        } else if (num1 < 0 && num2 >= 0) {
        
            System.out.println("El numero 1 es negativo");
            
        } else if (num1 >= 0 && num2 < 0) {
        
            System.out.println("El numero 2 es negativo");
        
        } else {
        
            int suma;
            suma = num1 + num2;
            System.out.println("La suma de los dos numeros postivos es: " + suma);
        
        }
    }
    
}
