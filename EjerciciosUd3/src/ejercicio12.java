
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author aldar
 */
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random genera = new Random();
        
        int min = 80;
        int max = 20;
        
        int[] numeros = new int[50];
        
        int calculos[] = {0, 0, 0, 0};
        
        for (int i = 0; i < 50; i++) {
            
            int aux;
            numeros[i] = genera.nextInt(60) + 20;
            aux = numeros[i];
            
            if (aux < min) {
            
                calculos[0] = aux;
                min = aux;
                
            }
            
            if (aux > max) {
            
                calculos[1] = aux;
                max = aux;
            }
            
            calculos[2] += aux; 
            
        }
        
        calculos[3] = calculos[2] / (calculos.length);
        
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.println(numeros[i]);
            
        }
        
        System.out.println("");
        
        for (int i = 0; i < calculos.length; i++) {
            
            System.out.println(calculos[i]);
            
        }
        
        
    }
    
}
