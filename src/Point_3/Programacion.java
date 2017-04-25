/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Point_3;

import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Programacion {
     private ArrayList<Sala> sala;

    public Programacion() {
        this.sala = new ArrayList<>();
    }
    public void add(Sala a){
       sala.add(a);
    }
    public Programacion(ArrayList<Sala> sala) {
        this.sala = sala;
    }
     public void planeacion(){
         for (int i = 0; i < this.sala.size(); i++) {
             System.out.println("numero de sala "+this.sala.get(i).getNumero());
              for (int j = 0; j < this.sala.get(i).getSemana().size(); j++) {
                  System.out.println("numero de semana "+this.sala.get(i).getSemana().get(j).getNumber());
                  for (int k = 0; k < this.sala.get(i).getSemana().get(j).getNumDias(); k++) {
                    System.out.println("nombre"+this.sala.get(i).getSemana().get(j).getDia()[k].getNombre());  
                      for (int l = 0; l < this.sala.get(i).getSemana().get(j).getDia()[k].segmentos.size(); l++) {
                          System.out.println("actividad ejn el segmento "+(l+1)+this.sala.get(i).getSemana().get(j).getDia()[k].segmentos.get(l).getActividad());
                      }
                  }
             }
             System.out.println("-----------------------------------");
         }
     }
}
