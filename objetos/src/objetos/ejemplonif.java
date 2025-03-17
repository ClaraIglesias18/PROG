/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author dual109
 */
public class ejemplonif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int suma = 0;
        
        int num1 = (int)(Math.random() * 10);
                
        int nif = num1;
        suma = suma + nif;
        
        for (int i = 0; i < 7; i++) {
            
            nif = nif * 10;
            int num = (int)(Math.random() * 10 + 1);
            
            while(num >= 10) {
            
                num = (int)(Math.random() * 10 + 1);
                
            }
            
            suma = suma + num;
            nif = nif + num;
            
            
        }
        
        System.out.println(nif);
        
        String letra[] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int rest = suma / 23;
        
        System.out.println("La letra es: " + letra[rest]);
        
        
        
    }
    
}
