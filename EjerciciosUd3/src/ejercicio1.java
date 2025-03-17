
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author clara
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
               
        double[] ventas = new double[5];
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Introduce datos tienda " + i);
            ventas[i] = leer.nextDouble();
            
        }
        
        double max = 0;
        double min = ventas[0];
        double total = 0;
        int posMax = 0;
        int posMin = 0;
        
        
        for (int i = 0; i < ventas.length; i++) {
            
            if (ventas[i] > max) {
            
                max = ventas[i];
                posMax = i;
                
            }
            
            if(ventas[i] < min) {
            
                min = ventas[i];
                posMin = i;
                
            }
            
            total += ventas[i]; 
            
        }
        
        System.out.println("El importe total de venta es de: " +  total);
        System.out.println("La tienda que mas vendio es: " + posMax);
        System.out.println("La tienda que menos vendio es: " + posMin);
        
    }
    
}
