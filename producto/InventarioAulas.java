/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarioaulas;

import java.util.Scanner;

/**
 *
 * @author jnieto
 */
public class InventarioAulas {

    /**
     * @param args the command line arguments
     */
    
    public static void testProducto(){
        Producto p1= new Producto("Monitor Philips",20);
        Producto p2= new Producto("Monitor",20);
        Producto p3= new Producto("ratón",20);
        
        System.out.println(p1);
        System.out.println(p3);
        System.out.println(p1.contiene("Monitor"));
        System.out.println(p3.contiene("Monitor"));
        System.out.println(p1.contiene(p2));
        
        
        
        
    }
    public static void main(String[] args) {
        //testProducto();
        Producto p1;
        Producto [] inventario;
        Scanner leer = new Scanner(System.in);
        
        
        p1= new Producto("Libreta",40);
        System.out.println(p1);
        
        
        inventario= new Producto[5];
        System.out.println("matriz");
        inventario[0]=p1;
        System.out.println(inventario[0]);
        inventario[1]= new Producto("altavoces",1);
        System.out.println(inventario[1]);
        for (int i = 2; i < inventario.length; i++) {
            inventario[i] = new Producto(leer.next(),leer.nextInt());
            
   
        }
        
        System.out.println("id \tnombre\tcantidad\t");
        for (Producto p : inventario) {
            System.out.println(p);
        }
        
        
    }
    
}
