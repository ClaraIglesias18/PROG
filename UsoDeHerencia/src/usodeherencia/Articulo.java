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
public class Articulo extends Publicacion{
    private String tituloRevista;
    private int numVolumen;
    private int pagInicial;
    private int pagFinal;
    /**
     * 
     * @param tituloRevista
     * @param numVolumen
     * @param pagInicial
     * @param pagFinal
     * @param ano
     * @param titulo
     * @throws IllegalArgumentException 
     */
    public Articulo(String tituloRevista, int numVolumen, int pagInicial, int pagFinal, int ano, String titulo) throws IllegalArgumentException {
        super(ano, titulo);
        this.tituloRevista = tituloRevista;
        this.numVolumen = numVolumen;
        this.setPaginas(pagInicial, pagFinal);
    }
    
    /**
     * 
     * @param pagInicial
     * @param pagFinal
     * @throws IllegalArgumentException Cuando la página inicial y/o final 
     * tienen valor incorrecto:
     * menor que cero o la final inferior a la inicial
     */
    public void setPaginas(int pagInicial, int pagFinal) throws IllegalArgumentException{
        if (pagInicial<1 || pagFinal<1 || pagFinal<pagInicial){
            throw new IllegalArgumentException("Las páginas inical y final deben ser mayores que cero y la final igual o superior a la inicial");
        }
        this.pagInicial=pagInicial;
        this.pagFinal=pagFinal;
    }

    public String getTituloRevista() {
        return tituloRevista;
    }

    public int getNumVolumen() {
        return numVolumen;
    }

    public int getPagInicial() {
        return pagInicial;
    }

    public int getPagFinal() {
        return pagFinal;
    }

    public int getNumPaginas(){
        return getPagFinal()-getPagInicial()+1;
    }

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();
        
        ret.append("Artículo: ");
        ret.append(super.toString());
        ret.append("\n\tTitulo de la revista: ").append(this.getTituloRevista());
        ret.append("\n\tNúmero de Volumen: ").append(this.getNumVolumen());
        ret.append("\n\tNúmero de Páginas: ").append(this.getNumPaginas());
     
        
        return ret.toString();
    }
   
    
    
}
