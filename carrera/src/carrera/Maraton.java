/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrera;

/**
 *
 * @author clara
 */
public class Maraton {
    String nombre;
    private Atleta corredores[];
    private int pos=0;
   
    /**
     * Constructor
     * @param num numero de corredores
     * @throws IllegalArgumentException en el caso de que num sea igual o menor que cero
     */
    
    public Maraton(int num) throws IllegalArgumentException{
        if (num<=0) {
            throw new IllegalArgumentException("El Número de corredores ha de ser mayor que cero");
        }
        corredores=new Atleta[num];
    }
    public boolean insertaCorredor(Atleta a) throws IllegalArgumentException{
        
        
        if (estaLleno()) {
            throw new IllegalArgumentException("Carrera tiene la inscripción completa");
        }
        this.corredores[pos]=a;
        ++pos;
        return true;
    }
    
    public boolean estaLleno(){
        return (pos>=corredores.length);
    }
    
    public boolean estaVacio(){
        return (pos==0);
    }
    public boolean estaVacio2(){
        return(corredores[0]==null);
    }
    
    public boolean estaLleno2(){
        return(corredores[corredores.length-1]!=null);
    }
    /**
     * Devuelve el número de atletas inscritos en la maratón
     * @return el número de atletas inscritos como entero
     */
    public int getInscritos(){
        return pos;
    }
    public Atleta getCorredor(int num){
        if (num<0 || num>=pos){
            throw new IllegalArgumentException("Corredor en posición no disponible");
        }
        return(corredores[num]);
    }

    @Override
    public String toString() {
        StringBuilder ret= new StringBuilder();
        
        ret.append("Dorsal \tNombre \n");
        for (int i = 0; i < pos; i++) {
            ret.append(corredores[i]+"\n");
        }
        return ret.toString();
    }
}
