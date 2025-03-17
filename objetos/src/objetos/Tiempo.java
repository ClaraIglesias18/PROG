/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author clara
 */
public class Tiempo {
    
        private int minutos;
        private int segundos;
        
        public Tiempo() {
        
            minutos = 0;
            segundos = 0;
            
        }
        
        public void incrementarTiempo(int seg) {
        
                this.minutos = minutos + segundos / 60;
                segundos = segundos + (seg % 60);
               
        }
        
        @Override
        
    
    }
    
}
