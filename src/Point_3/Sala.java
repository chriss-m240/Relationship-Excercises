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
public class Sala {
    private ArrayList<Semana> semana;
    private int numero;

    public Sala(int numero) {
        this.numero = numero;
        this.semana = new ArrayList<>();
    }


    public void AddSemana(Semana x){
 
      semana.add(x);
    }

    public ArrayList<Semana> getSemana() {
        return semana;
    }

    public int getNumero() {
        return numero;
    }

    public void setSemana(ArrayList<Semana> semana) {
        this.semana = semana;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}


