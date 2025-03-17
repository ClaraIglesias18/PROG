/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explicacioncontenedores;

import java.util.Calendar;

/**
 *
 * @author dual109
 */
public class Futbolista {
    public static enum Posicion {PORTERO, DEFENSA ,MEDIO ,DELANTERO};
    private String nombre;
    private int dorsal;
    private int anho;
    private int ficha;
    private Posicion pos;
    private Equipo equipo;

    public Futbolista(String nombre, int anho, Posicion pos) {
        this.nombre = nombre;
        this.anho = anho;
        this.pos = pos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public int getEdad() {
        
        Calendar hoy = Calendar.getInstance();
        int edad;
        edad=hoy.get(Calendar.YEAR) - this.anho;
        
        
        return edad;
    }

    public int getFicha() {
        return ficha;
    }

    public Posicion getPos() {
        return pos;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setFicha(int ficha) {
        this.ficha = ficha;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("nombre=" + getNombre()+"\n");
        ret.append("Dorsal= " + getDorsal()+"\n");
        ret.append("edad=" + getEdad()+"\n");
        ret.append("ficha= " + getFicha()+"\n");
        ret.append("Posicion = " + this.getPos().toString()+"\n");
        
        if (equipo !=null)ret.append("Equipo=" + equipo.getNombre()+"\n");
        return ret.toString();
    }

}
