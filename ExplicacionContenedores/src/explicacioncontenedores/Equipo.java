/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explicacioncontenedores;

/**
 *
 * @author dual109
 */
public class Equipo {
    
    private String nombre;
    private String estadio;
    private String direccion;
    private static int num=0;
    private Futbolista [] futbolistas;

    public Equipo(String nombre, String estadio, String direccion) {
        this.nombre = nombre;
        this.estadio = estadio;
        this.direccion = direccion;
        futbolistas = new Futbolista[26];
    }
    

    public String getNombre() {
        return nombre;
    }
    public boolean estaVacio(){
        //return (futbolistas[0]==null);
        return (num==0);
    }
    public boolean estaLleno(){
        return (num>= futbolistas.length);
    }
    
    public boolean estaLibre(int dorsal){
        int pos=0;
        
        while(  pos<num && dorsal!= futbolistas[pos].getDorsal() ){
            ++pos;
        }
        return (pos==num);
    }
    public boolean insertaFutbolista(Futbolista futbolista, int dorsal) throws Exception{
        if (this.estaLleno()){
            throw new ArrayIndexOutOfBoundsException("El equipo ya está completo");
        }
        if (!estaLibre(dorsal)){
            throw new Exception("El dorsal "+dorsal+" ya está ocupado");
        }
        futbolista.setDorsal(dorsal);
        futbolista.setEquipo(this);
        futbolista.setFicha(num);
        futbolistas[num]=futbolista;
        num++;
        return true;
    }
    
    public int getNumeroFichas(){
        return num;
    }
    
    public Futbolista buscaDorsal(int num) {
    
        Futbolista ret = null;
        
        int pos = 0;
        
        while (pos < getNumeroFichas() && futbolistas[pos].getDorsal() != num) {
        
            ++pos;
        
        }
        
        if (pos != getNumeroFichas()) ret = futbolistas[pos];
        
        return ret;
    
    }

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder("Equipo" + nombre + ", estadio=" + estadio + ", direccion=" + direccion + '\n');
        
        for (int i = 0; i < getNumeroFichas(); i++) {
            ret.append(futbolistas[i] + "\n--------------\n");
        }
        if (estaVacio()) ret.append("Este equipo todavía no ha fichado jugadores");
        
        return ret.toString();
    }
 
    
}
