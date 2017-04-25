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
public class Dog extends Pet {
    
    private String breed;

    public Dog(String id, String name, String hairColor, String breed) {
        super(id, name, hairColor);
        this.breed = breed;
        this.type = "Dog";
    }

    @Override
    public String sound() {
        return "Guau";
    }
    
}
