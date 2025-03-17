/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarioaulas;

/**
 *
 * @author jnieto
 */
public class Producto {
    private int id;
    private String nombre;
    private int cantidad;
    private static int numProductos=0;

    public Producto(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        id=++numProductos;
    }

    public boolean contiene(String cadena){
        boolean ret = false;
            if(nombre.indexOf(cadena)!=-1) ret = true;
        return ret;
    }
    public boolean contiene(Producto p){
        
         boolean ret = false;
            if(nombre.indexOf(p.nombre)!=-1) ret = true;
        return ret;

        
    }
    
    @Override
    public String toString() {
        return  id + "\t" + nombre + "\t" + cantidad + "\n";
    }
    
    
    
    
    
    
}
