/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionpacientes;

/**
 *
 * @author clara
 */
public class Clinica {
    
    private String nombre;
    private String direccion;
    private Medico medicos[];
    private int MaxMed;
    private int numMed = 0;
    
    /**
     * Se crea la clinica con un numero maximo de medicos
     * 
     * @param nombre
     * @param direccion
     * @param numMaxMed 
     */
    
    public Clinica(String nombre, String direccion, int MaxMed) {
        
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setNumMaxMed(MaxMed);
        
                    
    }
    
    public void setNombre(String nombre) throws IllegalArgumentException {
        
        if (nombre.isBlank()) {
        
            throw new IllegalArgumentException("El campo nombre no puede estar vacio");
        
        }
        
        this.nombre = nombre;
    
    }
    public void setDireccion(String direccion) throws IllegalArgumentException {
        
        if (direccion.isBlank()) {
        
            throw new IllegalArgumentException("El campo direccion no puede estar vacio");
        
        }
        
        this.direccion = direccion;
    
    }
    public void setNumMaxMed(int numMaxMed) throws IllegalArgumentException {
        
        if (numMaxMed <= 0) {
        
            throw new IllegalArgumentException("El numero maximo de medicos no puede ser ni 0 ni negativo");
        
        }
        
        this.medicos = new Medico[numMaxMed];
    
    }
    
    public int getMaxMed() {
    
        return MaxMed;
    
    }
    
    public int getNumMed() {
    
        return numMed;
    
    }
    
    public String getNombre() {
    
    
        return nombre;
    
    }
    
    public String getDirecicon() {
    
        return direccion;
            
    }
    
    //insserta medico
    public void insertaMedico(Medico medico) throws ArrayIndexOutOfBoundsException {
    
        if (numMed == getMaxMed()) {
        
            throw new ArrayIndexOutOfBoundsException("El numero de medicos para esta clinica esta completo");
            
        }
        
        medicos[numMed] = medico;
        numMed++;
       
               
    }
    

    //elimina medico
    
    public void eliminaMedico(int codigo) throws Exception {
    
        if (codigo > numMed) {
        
            throw new Exception("El codigo no corresponde con ningun medico");
        
        }
        
        for (int i = codigo; i < numMed; i++) {
            
            if (i == numMed) {
            
                medicos[i] = null;
            
            } else {
            
                medicos[i] = medicos[i+1];
                
            }
            
        }
        
        --numMed;
    
    }
    
    //consulta medico

    @Override
    public String toString() {
        
        StringBuilder ret = new StringBuilder();
        
        ret.append("\n\tNombre: ").append(nombre);
        ret.append("\n\tDireccion: ").append(direccion);
        ret.append("\n\tNumero maximo de medicos: ").append(numMed);
        ret.append("\n\tNumero de medicos: ").append(numMed);
        
        for (int i = 0; i < numMed; i++) {
            
            ret.append(medicos[i] +  "\n---------------\n");
            
        }
        
        if (numMed == 0) {
        
            ret.append("Todavia no hay medicos dados de alta en la clinica");
        
        }
        
        return ret.toString();
        
    }
    
    
    
}
