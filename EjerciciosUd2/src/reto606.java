
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author clara
 */
public class reto606 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int dias,precio;
        int mayor;
        int cont = 1;
        
        Scanner leer = new Scanner(System.in);
        
        dias = leer.nextInt();
        precio = leer.nextInt();
        mayor = precio;
        
        while (dias != 0) {
        
            for (int i = 1; i < dias; i++) {
        
                precio = leer.nextInt();
                if (precio > mayor) {
                
                    mayor = precio;
                    cont = cont + 1;
                }
            }
            
            System.out.println(cont);
            dias = leer.nextInt();
        }
        

        
        
    }
    
}
