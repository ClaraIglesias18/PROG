/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionpacientes;

import java.util.Date;

/**
 *
 * @author clara
 */
public class Cita {
    
    private int dia;
    private int mes;
    private int ano;
    private int hora;
    private int min;
    private Medico medico;
    private Paciente paciente;
    
    
    public Cita(int dia, int mes, int ano, int hora, int min) {
    
        this.dia = dia;
        this.ano = ano;
        this.mes = mes;
        this.hora = hora;
        this.min = min;
    
    }
    
}
