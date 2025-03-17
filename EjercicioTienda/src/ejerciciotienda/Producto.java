/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotienda;

/**
 *
 * @author dual109
 */
public class Producto {
    
    private String nombre;
    private int id;
    private int cantidad;
    private static int totalProd = 0;
    
    public Producto(String nombre, int id, int cantidad) {
    
        this.nombre = nombre;
        this.id = id;
        this.cantidad = cantidad;
        totalProd++;
        id = totalProd;
        
    }
    
    
    
}
