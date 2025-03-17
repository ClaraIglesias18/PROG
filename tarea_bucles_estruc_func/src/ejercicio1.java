
import java.util.Scanner;

/**
 *
 * @author clara
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        Scanner leer = new Scanner(System.in);
        
        int num;
        num = leer.nextInt();
        
        int num2 = num;
        
        for (int i = 0; i < 14; i++) {
            
            num2 = num * num2;
            
        }
        
        System.out.println(num2);
        
    }
    
}
