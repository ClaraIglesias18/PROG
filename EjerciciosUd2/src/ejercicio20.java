
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author clara
 */
public class ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escribe un numero: ");
        int num1;
        num1 = leer.nextInt();
        
        System.out.println("Escribe un numero: ");
        int num2;
        num2 = leer.nextInt();
        
        if (num1 % 2 == 0 && num2 % 2 == 0 && num1 < 50 && num2 >= 100 && num2 <= 500) {
        
            int suma;
            suma = num1 + num2;
            System.out.println("La suma de los dos numeros es: " + suma);
        
        } else System.out.println("Os numeros non cumplen os criterios");
        
    }
    
}
