/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2productos;

/**
 *
 * @author jnieto
 */
public class Almacen {
    private final Producto[] productos;
    private int numProductos;

    /**
     * Nueva Clinica con un num. max. de productos.
     *
     * @param maxProductos el num. max. de productos, como entero.
     */
    public Almacen(int maxProductos) {
        this.numProductos = 0;
        this.productos = new Producto[maxProductos];
    }

    /**
     * Devuelve el paciente situado en pos
     *
     * @param pos el lugar del paciente en el vector de productos
     * @return el objeto Producto correspondiente.
     */
    public Producto get(int pos) throws Exception {
        if (pos >= getNumProductos()) {
            
            throw new Exception("get(): sobrepasa la pos: " + (pos + 1) + " / " + getMaxProductos());
            
        }

        return this.productos[pos];
    }

    /**
     * Devuelve el num. de productos creados.
     *
     * @return el num. de productos existentes, como entero.
     */
    public int getNumProductos() {
        return this.numProductos;
    }

    /**
     * Devuelve el max. de numProductos
     *
     * @return el num. de productos max,, como entero
     */
    public int getMaxProductos() {
        return this.productos.length;
    }

    /**
     * Inserta un nuevo paciente.
     *
     * @param p el nuevo objeto Producto
     */
    public void inserta(Producto p) throws Exception {
        final int maxProductos = getMaxProductos();

        if (getNumProductos() >= maxProductos) {
            
            throw new Exception ("inserta(): sobrepasa max.: " + maxProductos);
            
        }

        this.productos[this.numProductos] = p;
        this.numProductos++;
    }

    /**
     * Elimina el papciente que se encuentra en la posición indicada.
     *
     * @param pos la posición del paciente a eliminar
     */
    public void elimina(int pos) throws IllegalArgumentException {
        
        if (pos >= numProductos || pos < 0){
        
            throw new IllegalArgumentException("No existe producto en la posicion indicada");
        
        }
        
        for (int i = pos; i < numProductos - 1; i++) {
            
            productos[i] = productos[i + 1];
            
        }
        
        --numProductos;
        productos[numProductos] = null;
        
    }
    
    @Override
    
    public String toString() {
    
        StringBuilder ret = new StringBuilder();
        
        ret.append("\n\tNumero de productos en almacen: ").append(numProductos);
        ret.append("\n\tNumero maximo de productos: ").append(getMaxProductos());
        ret.append("\n------------------------");
        
        for (int i = 0; i < numProductos; i++) {
            
            
            ret.append(productos[i].toString());
            ret.append("\n------------------------");
        }
        
        
                
        return ret.toString();
    
    }
    
    public String toString(Producto.TipoProducto t) {
    
        StringBuilder ret = new StringBuilder();
        
        for (int i = 0; i < getNumProductos(); i++) {
            
            if(productos[i].getTipoProducto().equals(t)) {
                
                ret.append(productos[i]);
            
            }
        
        }
        
        return ret.toString();
    
    }
    
}
