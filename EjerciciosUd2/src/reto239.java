
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
public class reto239 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // CADA GTS = 144s
        
        Scanner leer = new Scanner(System.in);
        
        int dias;
        dias = leer.nextInt();
        
        int emisoras;
        emisoras = leer.nextInt();
        
        while (dias != 0 || emisoras != 0) {
        
            int tiempo = emisoras * dias;
            int seg = tiempo * 144;
            
            int dia = seg / 86400;
            int diaFin = seg % 86400;
            int horas = diaFin / 3600;
            int horasFin = diaFin % 3600;
            int min = horasFin / 60;
            int segFin = horasFin % 60;
            
            String diac = String.valueOf(dia);
            String horasc = String.valueOf(horas);
            String minc = String.valueOf(min);
            String segc = String.valueOf(segFin);
            
            System.out.print(diac);
            
            System.out.print(":");
            
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
            
            
            dias = leer.nextInt();
            emisoras = leer.nextInt();
                                    
        }
    }
    
}
