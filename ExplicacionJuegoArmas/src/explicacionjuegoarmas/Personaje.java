/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explicacionjuegoarmas;

/**
 *
 * @author jnieto
 */
public class Personaje {
    private String nombre;
    private Arma arma;
    private int velocidad;
    private int vida;
    private int blinda;

    public Personaje(String nombre, Arma arma, int velocidad, int vida, int armadura) {
        this.nombre = nombre;
        this.arma = arma;
        this.velocidad = velocidad;
        this.vida = vida;
        this.blinda = armadura;
    }

    public boolean dispara (){
        return arma.dispara();
    }
    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", arma=" + arma + ", velocidad=" + velocidad + ", vida=" + vida + ", armadura=" + blinda + '}';
    }
    
    
    
    
}
