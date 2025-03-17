/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopeluqueria;

/**
 *
 * @author dual109
 */
public class Clientes {
 
    private String nombre;
    private String direccion;
    private int dni;
    private tipoCliente tipo;
    private enum tipoCliente{VIP, CARNET_JOVEN, NORMAL, JUBILADO};
    
    public Clientes(String nombre, int dni) {
    
        this.nombre = nombre;
        this.dni = dni;
        this.tipo = tipoCliente.NORMAL;
    
    }
    
    public Clientes (String nombre, int dni, tipoCliente tipo) {
    
        this.nombre = nombre;
        this.dni = dni;
        this.tipo = tipo;
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getDni() {
        return dni;
    }

    public tipoCliente getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setTipo(tipoCliente tipo) {
        this.tipo = tipo;
    }
    
    @Override
    
    public String toString() {
    
        StringBuilder ret = new StringBuilder();
        ret.append("Nombre: ").append(nombre).append("\n");
        ret.append("Dni: ").append(dni).append("\n");
        
        return ret.toString();
        
    }
    
    
    
}
