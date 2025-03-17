/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usodeherencia;

import java.util.Scanner;

/**
 *
 * @author jnieto
 */
public class UsoDeHerencia {

    /**
     * @param args the command line arguments"
     */
    public static void main(String[] args) {
      Publicacion p = new Publicacion(1953, "Clases programación");
      int ano;
      Scanner scan = new Scanner(System.in);
      String titulo;
      
      do{
          ano=scan.nextInt();
      } while(ano<1980);
      
      titulo = scan.nextLine();
      
      System.out.println(new Publicacion(ano,titulo));
      }
          }
    

