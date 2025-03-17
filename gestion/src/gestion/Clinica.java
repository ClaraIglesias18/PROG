/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

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
     * @param MaxMed 
     */
    
    public Clinica(String nombre, String direccion, int MaxMed) {
        
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setMaxMed(MaxMed);
        
                    
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
    public void setMaxMed(int MaxMed) throws IllegalArgumentException {
        
        if (MaxMed <= 0) {
        
            throw new IllegalArgumentException("El numero maximo de medicos no puede ser ni 0 ni negativo");
        
        }
        
        this.MaxMed = MaxMed;
        this.medicos = new Medico[MaxMed];
    
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

    public Medico[] getMedicos() {
        
        return medicos;
    
    }
    
    
    
    //insserta medico
    public void insertaMedico(Medico medico) throws ArrayIndexOutOfBoundsException {
        
        System.out.println(getMaxMed());
        
        if (numMed == getMaxMed()) {
        
            throw new ArrayIndexOutOfBoundsException("El numero de medicos para esta clinica esta completo");
            
        }
        
        medicos[numMed] = medico;
        numMed++;
                       
               
    }
    

    //elimina medico
    
    public void eliminaMedico(int pos) {
        
        System.out.println("Esta seguro que desea eliminar?" + medicos[pos].toString());
        
        String dec = Entrada.leeCadena("Escoja (S/N)");
        
        if (dec.equals("S") || dec.equals("s")) {
        
            for (int i = pos; i < numMed; i++) {
            
            if (i == numMed) {
            
                medicos[i] = null;
            
            } else {
            
                medicos[i] = medicos[i+1];
                
            }
            
        }
        
        --numMed;
                        
        }
                    
    }
    
    //consulta medico
    
    

    @Override
    public String toString() {
        
        StringBuilder ret = new StringBuilder();
        
        ret.append("\n\tNombre: ").append(nombre);
        ret.append("\n\tDireccion: ").append(direccion);
        ret.append("\n\tNumero maximo de medicos: ").append(MaxMed);
        ret. append("\n----------------\n");
        
        for (int i = 0; i < numMed; i++) {
            
            ret.append(medicos[i] +  "\n---------------\n");
            
        }
        
        if (numMed == 0) {
        
            ret.append("\nTodavia no hay medicos dados de alta en la clinica");
        
        } else ret.append("\n\tNumero de medicos: ").append(numMed);
        
        return ret.toString();
        
    }
    
}
