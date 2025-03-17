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
public class Alumnos {
    
    private int id;
    /**numero toal de alumnos
     * aprovecho para gestionar el id
     */
    private static int numAlumno = 0;
    private String nombre;
    private int anho;
    
    /**
     * Constructor al que le pasamos un nombre y una fecha de nacimiento
     * @param nombre
     * @param anho 
     */
    
    public Alumnos(String nombre, int anho) {
    
        this.nombre = nombre;
        this.anho = anho;
        id = ++numAlumno;
            
    }
    
    public static int getTotalAlumnos(){
    
        return numAlumno;
    
    }
    
    @Override
    public String toString() {
    
        return("id = " + id + " nommbre = " + nombre + " anho = " + anho);
    
    }
    
}
