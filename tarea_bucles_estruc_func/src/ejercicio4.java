
import java.util.Scanner;

/**
 *
 * @author clara
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Scanner leer = new Scanner(System.in);
        
        int sum = 0;
        int num;
        num = leer.nextInt();
        
        
        while (num != 0) {
        
            if (num > 0) {
            
                for (int i = 1; i <= num; i++) {
                        
                    if (i % 2 == 0) {
                
                    sum = sum + i;
            
                    }  
                    
                }
                
                System.out.println(sum);
            
            } else System.out.println("El numero introducido no puede ser negativo");
            
            
            num = leer.nextInt();
        
        }
        
    }
    
}
