
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author clara
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random aleatorio = new Random();
        
        long t0, t1, t2;
        
        double dado[] = {0, 0, 0, 0, 0, 0};
        
        t0 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            
            int aux = 0;
            aux = aleatorio.nextInt(6) + 1;
            
            for (int j = 0; j < dado.length; j++) {
                
                if(aux == j + 1) {
                
                    dado[j] = dado[j] + 1;
                
                }
                
            }
        }
        t1 = System.currentTimeMillis();
        
        t2 = t1 -t0;
        
        for (int i = 0; i < dado.length; i++) {
            
            System.out.println("El numero " + (i + 1) + " ha salido " + dado[i] + " veces");
            
        }
        
        System.out.println("El tiempo de ejecuccion fue de: " + t2);
        
    }
    
}
