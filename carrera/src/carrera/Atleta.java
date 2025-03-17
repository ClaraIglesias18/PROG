/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrera;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author clara
 */
public class Atleta {
    private static int inscritos=0;
    private String nombre;
    private int edad;
    private int dorsal;
    private int pos;
    private LocalTime salida;
    private LocalTime llegada;

    public Atleta(String nombre, int edad) {
        this.nombre = nombre.trim();
        this.dorsal= ++inscritos;
        this.edad=edad;
        salida=LocalTime.now();
    }

    public String getNombre() {
        return nombre;
    }

    public int getDorsal() {
        return dorsal;
    }
    
    

    @Override
    public String toString() {
        return String.format("%03d - %s",getDorsal(),getNombre());
    }
}
