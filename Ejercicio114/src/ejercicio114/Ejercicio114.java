/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio114;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jnieto
 */
public class Ejercicio114 {

    public static Scanner leer = new Scanner(System.in);

    public static Cliente nuevoCliente() {
        Cliente ret = null;
        String nombre, nif;
        Character s;
        int anho, peso, altura;
        Cliente.Sexo sexo;
        boolean error = true;
        
        while (error) {
            try {
                System.out.println("Nombre: ");
                nombre = leer.nextLine();
                System.out.println("Año de nacimiento: ");
                anho = leer.nextInt();
                System.out.println("Nif: ");
                nif = leer.nextLine();
                System.out.println("Sexo (H/M)");
                s = leer.nextLine().toUpperCase().charAt(0);
                switch (s) {
                    case 'H':
                        sexo = Cliente.Sexo.H;
                        break;
                    case 'M':
                        sexo = Cliente.Sexo.M;
                        break;
                    default:
                        throw new OutOfRangeException("El sexo sólo puede ser H (hombre) o M (mujer)");
                }
                System.out.println("Peso (15-180 kg)");
                peso = leer.nextInt();
                System.out.println("Altura(110-225 cm)");
                altura = leer.nextInt();
                ret = new Cliente(nombre, anho, nif, sexo, peso, altura);
                error = false;
            } catch (OutOfRangeException e) {
                leer.nextLine();
                System.out.println("Error en el rango posible de valores. " + e.getMessage());
            } catch (InputMismatchException e) {
                leer.nextLine();
                System.out.println("Error, el dato introducido no es de tipo numérico");
            } 
            finally{
                if (error) System.out.println("Por favor vuelva a introducir los datos correctamente");
            }
        }
        return (ret);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cliente prueba;
        prueba = nuevoCliente();
        
        System.out.println(prueba.getIndiceYRango());
    }

}
