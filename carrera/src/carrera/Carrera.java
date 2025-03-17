/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carrera;

import java.util.Scanner;

/**
 *
 * @author clara
 */
public class Carrera {

     public static int leeNum(Scanner scan, String msg)
	{
		int ret = 0;
		boolean repite;
                String cad;
		do {
			repite = false;
			System.out.print( "\n" + msg );
                        cad=scan.nextLine();
			try {
                                
				ret = Integer.parseInt( cad );
			} catch(NumberFormatException exc)
			  {
                                        System.err.format("   Ha sido imposible convertir %s a entero\n",cad);
					repite = true;
			  }
		} while( repite );
		return ret;
	}
    public static Atleta leeAtleta(Scanner scan){
        String nombre;
        int edad;
        
        nombre=leeCadena(scan, "Nombre del atleta: ");
        edad= leeNum(scan, "Edad del atleta: ");
        
        return (new Atleta(nombre, edad));
    }
    public static String leeCadena(Scanner scan, String msg){
        String cad;
        boolean repite;
       do{
           repite=false;
           System.out.println(msg);
           cad=scan.nextLine();
           if (cad.trim().isEmpty()){
               repite=true;
               System.err.println("La cadena no puede estar vacía");
           }
       }while (repite);
       return cad;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        Maraton ourense;
        
        ourense = new Maraton(5);
        System.out.println(ourense);
        ourense.insertaCorredor(leeAtleta(leer));
        System.out.println(ourense);
        
    }
    
}
