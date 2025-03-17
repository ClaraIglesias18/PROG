
import java.util.Scanner;

/**
 *
 * @author clara
 */
public class ejercicio5 {

    public static int factorial(int num) {
    
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            
            fact = fact * i;
            
        }
        
        return fact;
    
    }
    
    public static void main(String[] args) {
                
        Scanner leer = new Scanner(System.in);
        
        int num;
        num = leer.nextInt();
        
        while (num != 0) {
        
            if (num > 0) {
            
                System.out.println(factorial(num));
            
            } else System.out.println("Debes introducir numeros positivos");
                
            num = leer.nextInt();
        }
        
    }
    
}
