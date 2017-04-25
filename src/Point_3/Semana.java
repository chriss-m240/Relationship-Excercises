/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Point_3;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Semana {
    private ArrayList<Sala> sala;
    private Dia[] dia;
    private int number;
    private int numDias;

    public int getNumDias() {
        return numDias;
    }
  
    public Semana(int y) {
        this.dia= new Dia[5];
        this.number=y;
        this.numDias=0;
    }
    public ArrayList<Segmento> calcularhoraslibres(){
        ArrayList<Segmento> afa=new ArrayList<Segmento>();
        for (int i = 0; i < this.dia.length; i++) {
            for (int j = 0; j < this.dia[1].getSegmentos().toArray().length; j++) {
              
         if(this.dia[i].segmentos.get(j).isLibre()== true){
            afa.add(this.dia[i].segmentos.get(j));
         }
            }
        }
        return afa;
    }

    public void setSala(ArrayList<Sala> sala) {
        this.sala = sala;
    }

    public void setDia(Dia[] dia) {
        this.dia = dia;
    }

    public void setNumber(int number) {
        this.number = number;
    }
     public void Adddia(Dia x){
         this.numDias=this.numDias+1;
         for (int i = 0; i < this.dia.length;i++){
             if (this.dia[i]==null) {
                 this.dia[i]=x;
                 break;
             }
         }
    }

    public ArrayList<Sala> getSala() {
        return sala;
    }

    public Dia[] getDia() {
        return dia;
    }

    public int getNumber() {
        return number;
    }
     
}
