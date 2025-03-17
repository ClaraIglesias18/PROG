/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionpacientes;
import java.util.Scanner;
import static gestionpacientes.Entrada.*;

/**
 *
 * @author clara
 */
public class Ilc {
    
    public void ler() {
        
        int op;
        
        String nombre = leeCadena("\n\tNombre de la clinica: ");
        String direccion = leeCadena("\n\tDireccion: ");
        int maxMedicos = leeEntero("\n\tNumero maximo de medicos para la clinica: ");
        
        Clinica clinica = new Clinica (nombre, direccion, maxMedicos);
        
        do {
            System.out.println("\n-----------------------------------");
            System.out.println("Gestión de una clínica");

            op = menu();

            switch (op) {
                case 0:
                    System.out.println("Fin.");
                    break;
                case 1:
                    insertaMed(clinica);
                    break;
                /*case 2:
                    eliminaMedico();
                    break;
                  case 3:
                    consultaMedico();
                    break;
                case 4:
                    insertaPaciente();
                    break;
                case 5:
                    eliminaPaciente();
                    break;
                case 6:
                    consultaPaciente();
                    break;*/
                case 7:
                    System.out.println();
                    break;
                default:
                    System.err.println("No es correcta esa opción (" + op + ")");
            
            }
        
        } while (op != 0);
        
    }
    
    private int menu() {
        int toret;

        do {
            System.out.println(
                    "\n1. Inserta un nuevo medico\n"
                    + "2. Elimina un medico\n"
                    + "3. Consulta medico\n"
                    + "4. Inserta un nuevo paciente\n"
                    + "5. Elimina un paciente\n"
                    + "6. Lista pacientes\n"
                    + "0. Salir\n");
            toret = leeEntero("Selecciona: ");
        } while (toret < 0
                && toret > 6);

        System.out.println();
        return toret;
    }
        
    public void insertaMed(Clinica clinica) {
    
        System.out.println("\n-------------");
        System.out.println("\nAlta de medico ");
        
        Medico m = leeMedico();
        clinica.insertaMedico(m);
        
    
    }
    
    
    public static Medico leeMedico () {
        
        String nombre;
        String apellido;
        int ano;
        Medico.Especialidad esp;
        
        nombre = leeCadena("\nNombre: ");
        apellido = leeCadena("\nApellido: ");
        ano = leeEntero("\nEdad: ");
        esp = leeEsp();
        
        return (new Medico(nombre, apellido, ano, esp));
    
    }
    
    public static Medico.Especialidad leeEsp() {
        
        StringBuilder cad = new StringBuilder("Escoja la especialidad: \n");
        
        int num;

        for (int i = 0; i < Medico.Especialidad.values().length; i++) {
            cad.append(i + ".- " + Medico.Especialidad.values()[i].toString() + "\n");
        }
        do {

            num = Entrada.leeEntero(cad.toString());
        } while (num < 0 || num >= Medico.Especialidad.values().length);

        return (Medico.Especialidad.values()[num]);
        
    }
    
}
