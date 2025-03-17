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
public class Aula {
    private String nombre;
    private Producto [] productos =new Producto[100];
    private int posActual=0;

    public Aula(String nombre) {
        this.nombre = nombre;
    }
    public int insertarProducto(Producto p){
        int ret=-1;
        
        if (productos.length>posActual) 
        {
            productos[posActual]=p;
            ret=posActual;
            posActual++;
        }
        return ret;
    }
    
    public String buscarProducto(String buscado){
        StringBuilder ret= new StringBuilder();
        
        for (int i = 0; i < this.posActual; i++) {
            if (productos[i].contiene(buscado)) ret.append(productos[i].toString());
        }
        return ret.toString();
    }
    
    
}
