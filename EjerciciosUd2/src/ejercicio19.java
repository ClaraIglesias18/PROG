
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author clara
 */
public class ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escribe el numero 1: ");
        int num1;
        num1 = leer.nextInt();
        
        System.out.println("Escribe el numero 2: ");
        int num2;
        num2 = leer.nextInt();
        
        System.out.println("Escribe el numero 3: ");
        int num3;
        num3 = leer.nextInt();
        
        System.out.println("num1 = " + num1 + " " + "num2 = " + num2 + " " + "num3 = " + num3);
        if (num1 == num2 + num3) {
        
            System.out.println("Se cumple que num1 = num2 + num3");
            
        } else if (num2 == num1 + num3) {
        
            System.out.println("Se cumple que num2 = num1 + num3");
            
        } else if (num3 == num1 + num2) {
        
            System.out.println("Se cumple que num3 = num1 + num2");
            
        } else System.out.println("Ninguno de los numeros se puede obtener por la suma de los demas");
        
        
               
        
    }
    
}
