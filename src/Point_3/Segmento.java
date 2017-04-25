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
public class Segmento {
    private Date horaI;
    public Date horaf;
    private String actividad;
    private boolean libre;

    public Segmento(boolean libre, String actividad) {
    
        this.actividad = actividad;
        this.libre = libre;
    }

    public boolean isLibre() {
        return libre;
    }

    public Date getHoraI() {
        return horaI;
    }

    public Date getHoraf() {
        return horaf;
    }

    public String getActividad() {
        return actividad;
    }

  
}
