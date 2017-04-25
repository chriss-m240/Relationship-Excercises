/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Point_6;

/**
 *
 * @author Estudiante
 */
public class Hamster extends Pet{
    
    private double weigth;

    public Hamster(String id, String name, String hairColor, double weigth) {
        super(id, name, hairColor);
        this.weigth = weigth;
        this.type = "Hamster";
    }
     
    @Override
    public String sound() {
        return "...";
    }
}
