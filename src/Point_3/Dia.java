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
public class Dia {
   public ArrayList<Segmento> segmentos;
     private Date fecha;
    private String nombre;

    public Dia( String nombre) {
        this.nombre = nombre;
       this.segmentos= new ArrayList<>();
    }

    public Date getFecha() {
        return fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Segmento> getSegmentos() {

        return segmentos;
    }
     public void AddSegmento(Segmento x){
    
      segmentos.add(x);
    }
}
