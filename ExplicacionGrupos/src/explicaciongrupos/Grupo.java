/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explicaciongrupos;

/**
 *
 * @author dual109
 */
public class Grupo {
    
    private String nombre;
    private Alumnos [] alumnos;
    private int nalumnos = 0;
    
    public Grupo(String nombre, int maximo) {
    
        this.nombre = nombre;
        alumnos = new Alumnos[maximo];
    
    }
    
    public boolean insertarAlumno(Alumnos alumno) {
    
        boolean toret = false;
        
        if (alumnos.length > this.nalumnos) {
        
            alumnos[this.nalumnos] = alumno;
            nalumnos++;
            toret = true;
        
        } 
        
        return toret;
    
    }
    
    public int getNalumnos() {
    
        return nalumnos;
    
    }
    
    public Alumnos getPorId(int num) {
    
        Alumnos ret = null;
        
            if(num <= this.nalumnos) ret = alumnos[num];
            
        return ret;
    
    }
       
    @Override
    
    public String toString() {
    
        StringBuilder ret = new StringBuilder(nombre);
        
        for (int i = 0; i < this.nalumnos; i++) {
            
            ret.append(alumnos[i] + "\n");
            
        }
        
        return ret.toString();
    
    }
           
    
}
