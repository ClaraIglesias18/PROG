/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explicacionjuegoarmas;

/**
 *
 * @author jnieto
 */
public class ExplicacionJuegoArmas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arma a = new Arma("AK47",600,1,0,10);
        Personaje p1;
        System.out.println(a);
        
        p1= new Personaje("Sanitario",a,5,100,100);
        System.out.println(p1);
        System.out.println(p1.dispara());
        System.out.println(p1);
    }
    
}
