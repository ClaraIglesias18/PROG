
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author clara
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int[] num = new int[5];
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Introduce el numero " + (i + 1));
            num[i] = leer.nextInt();
                                    
        }
        
        boolean comprobar = false;
        int min = num[0];
        int max = 0;
        int posMin = 0;
        int posMax = 0;
        
        for (int i = 0; i < num.length; i++) {
            
            if (num[i] > max) {
            
                max = num[i];
                posMax = i;
                
            }
            
            if (num[i] < min) {
            
                min = num[i];
                posMin = i;
                
            }
            
        }
        
        System.out.println("Introduce otro numero: ");
        int otro;
        otro = leer.nextInt();
        int posOtro = 0;
        
        for (int i = 0; i < num.length; i++) {
            
            if(otro == num[i]){
            
                comprobar = true;
                posOtro = i;
                
            }
            
        }
        
        if(comprobar) {
        
            System.out.println("El numero introducido esta en la posicion " + posOtro);
            
        } else System.out.println("El numero introducido no esta en el array");
        
        System.out.println("El numero mas grande es: " + max);
        System.out.println("Se encuentra en la posicion " + posMax );
        System.out.println("El numero mas pequeño es: " + min);
        System.out.println("Se encuentra en la posicion " + posMin);
        
        
    }
    
}
