/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usodeherencia;

/**
 *
 * @author jnieto
 */
public  class Publicacion {
    private int ano;
    private String titulo;

    public Publicacion(int ano, String titulo) {
        this.setAno(ano);
        this.titulo = titulo;
    }

    /**
     * 
     * @param ano
     * @throws IllegalArgumentException 
     */
    public void setAno(int ano) throws IllegalArgumentException{
        if (ano < 1980){
            throw new IllegalArgumentException("No se aceptan publicaciones anteriores a 1980");
        }
        this.ano = ano;
    }
    

    public int getAno() {
        return ano;
    }
    
    public String getTitulo() {
        return titulo;
    }    

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();
        
        
        ret.append("\n\tTítulo: ").append(this.getTitulo());
        ret.append("\n\tAño de Publicación: ").append(this.getAno());
        return ret.toString();
    }
    
}
