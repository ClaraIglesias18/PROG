/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2productos;

/**
 *
 * @author jnieto
 */
public class Producto {
   
    private String nombre;
    private double cantidad;
    private double precio;
    public static enum TipoProducto {KILOGRAMOS, UNIDADES};
    private String codigoBarras;
    private TipoProducto tipoProducto;

    public Producto(String nombre, double cantidad, double precio, TipoProducto tipoProducto, String codigoBarras) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.tipoProducto = tipoProducto;
        this.codigoBarras = codigoBarras;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
    

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        
        StringBuilder ret = new StringBuilder();
        
        ret.append("\n\tNombre: ").append(nombre);
        ret.append("\n\tCantidad: ").append(cantidad);
        ret.append("\n\tPrecio: ").append(precio);
        ret.append("\n\tTipo de producto: ").append(tipoProducto);
        ret.append("\n\tCodigo de barras: ").append(codigoBarras);
        
        return ret.toString();
               
    }

 
    
    
}
