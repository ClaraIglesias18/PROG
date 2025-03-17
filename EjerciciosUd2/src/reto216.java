
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
public class reto216 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner leer = new Scanner(System.in);
        
        int gotas;
        int num;
        num = leer.nextInt();
        
        for (int i = 0; i < num; i++) {
                                   
            gotas = leer.nextInt();
            int horas = gotas / 3600;
            int min = (gotas - horas * 3600) / 60;
            int seg = gotas - (horas * 3600 + min * 60);
            String horasc = String.valueOf(horas);
            String minc = String.valueOf(min);
            String segc = String.valueOf(seg);
            
            if (horasc.length() <= 1) {
            
                System.out.print(0 + horasc);
            
            } else System.out.print(horasc);
            
            System.out.print(":");
            
            if (minc.length() <= 1) {
            
                System.out.print(0 + minc);
            
            } else System.out.print(minc);
            
            System.out.print(":");
            
            if (segc.length() <= 1) {
            
                System.out.print(0 + segc);
            
            } else System.out.print(segc);
            
            System.out.println("");
        }
    
    }
    
}
