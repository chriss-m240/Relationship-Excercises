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
public class Cat extends Pet {
    
    private boolean isHunter;
  

    public Cat(String id, String name, String hairColor, boolean isHunter) {
        super(id, name, hairColor);
        this.isHunter = isHunter;
        this.type = "Cat";
    } 

    @Override
    public String sound() {
        return "Miau";
    }
    
    
}
