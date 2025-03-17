
import java.util.Scanner;

/**
 *
 * @author clara
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Scanner leer = new Scanner(System.in);
        
        int sum = 0;
        int num;
        num = leer.nextInt();
        
        for (int i = 1; i <= num; i++) {
            
            if (i % 2 == 0) {
                
                sum = sum + i;
            
            }
                        
        }
        
        System.out.println(sum);
        
    }
    
}
