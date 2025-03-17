
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
public class reto373 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner leer = new Scanner(System.in);
        
        int num;
        num = leer.nextInt();
        
        for (int i = 0; i < num; i++) {
            
            long dim;
            long carasInt;
            long fuera;
            long cuadInt;
            long dentroTotal;
            dim = leer.nextInt();
                        
            if (dim == 2) {
            
                fuera = dim * 4;
                System.out.println(fuera);
                
            }else {
            
                carasInt = dim - 2;
                cuadInt = (dim - 2) * (dim - 2);
                dentroTotal = carasInt * (dim * dim - cuadInt);
                fuera = dim * dim *  2;
                System.out.println(fuera + dentroTotal);
            
            }
                                                            
        }
    
    }
    
}
