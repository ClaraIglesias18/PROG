

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
public class reto416 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            int num;
            String fecha;
            boolean rep = false;
            
            
            
            Scanner leer = new Scanner(System.in);
            
            num = leer.nextInt();
            leer.nextLine();
           
            
            while (num != 0) {
                                
                String [] fec;
                String[] diames = new String[num];
                
                for (int i = 0; i < num; i++) {
                
                    fecha = leer.next();
                    fec=fecha.split("/");
                    String resultado=fec[0]+"/"+fec[1];
                    diames[i] = resultado;
                                                           
                }
            
                //OK
                
                while (rep != true) {                
                for (int i = 0; i < (diames.length - 1); i++) {
                    
                    String comp = diames[i];
                         
                    for (int j = (i + 1); j < diames.length; j++) {
                    
                        if (diames[j].equalsIgnoreCase(comp) ) {
                        
                            rep = true;
                                                    
                        }
                                            
                    }
                                      
                }
                }
                
                if (rep) {
                
                    System.out.println("SI");
                
                } else System.out.println("NO");
                               
                num = leer.nextInt();
                leer.nextLine();
                    
            }                   
                                                   
        }
    
    }

