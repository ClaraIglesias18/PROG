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
public class Peluquerias {
    
    private String nombre;
    private String direccion;
    private int numClientes;
    private Clientes[] clientes;
          
    
    public Peluquerias(int maxClientes) {
                
        this.numClientes = 0;
        this.clientes = new Clientes[maxClientes];
    
    }
    
    public int getMaxClientes() {
    
               
        return this.clientes.length;
    
    }
    
    public String getNombre() {
        
        return this.nombre;
    
    }
    
    public String getDireccion() {
    
        return this.direccion;
        
    }
    
    public int getNumClientes() {
    
        return this.numClientes;
    
    }
    
    //metodo para ver si existe el cliente en el array
    
    public boolean existeCliente(int nuevoDni) {
        
        boolean existe = false;
                
        for (int i = 0; i < clientes.length; i++) {
            
            if (nuevoDni == clientes[i].getDni()) {
            
                existe = true;
            
            }
            
        }
        
        return existe;
    
    
    }
        
    //metodo para insertar cliente
    
    public void inserta(Clientes c) throws Exception {
        
                
        
        final int maxClientes = getMaxClientes();
        
        if (numClientes >= maxClientes) {
            
            throw new Exception ("No se pueden añadir mas clientes, la peluqueria esta llena");
            
        }
        
        this.clientes[this.numClientes] = c;
        this.numClientes++;
        
    }
    
    //metodo para eliminar segun dni
    
    public void elimina(int dni) throws Exception {
        
        if (!existeCliente(dni)) {
        
            throw new Exception ("No se puede eliminar por que no existe el cliente");
        
        }
        
        int pos = 0;
        
        for (int i = 0; i < clientes.length; i++) {
            
            if (dni == clientes[i].getDni()) {
            
                pos = i;
                                
            }
            
        }
        
        for (int i = pos; i < clientes.length; i++) {
            
            clientes[i] = clientes[i + 1];
            
        }
        
        --numClientes;
        clientes[numClientes] = null;
    
    }
    
    @Override
    
    public String toString() {
    
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < numClientes; i++) {
            
            ret.append(clientes[i]);
            
        }
        
        return ret.toString();
    
    }
    
            
    
}
