
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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double base;
        double altura;
        double area;
        
        Scanner leer1 = new Scanner(System.in);
        System.out.println("Escriba la base del triangulo: ");
        base = leer1.nextDouble();
        
        Scanner leer2 = new Scanner(System.in);
        System.out.println("Escriba la altura del triangulo: ");
        altura = leer2.nextDouble();
        
        area = (base * altura) / 2;
        
        System.out.println("El area del triangulo es: " + area);

       
    }
    
}
