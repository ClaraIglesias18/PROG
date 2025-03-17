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
    public static enum TipoProducto {KILOGRAMOS,UNIDADES}
    private String nombre;
    private double cantidad;
    private double precio;
    private TipoProducto tipoProducto;
    private String codigoBarras;

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
        StringBuilder ret= new StringBuilder();
        ret.append("Nombre: ").append(nombre).append("\n");
        ret.append("\tCantidad: ").append(cantidad).append("\n");
        ret.append("\tPrecio: ").append(precio).append("\n");
        ret.append("\tTipo Producto: ").append(tipoProducto.toString().toLowerCase()).append("\n");
        ret.append("\tCódigo de barras: ").append(codigoBarras).append("\n\n");
        
        return ret.toString();
        
    }

 
    
    
}
