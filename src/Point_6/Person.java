/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Point_6;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Person {
    
    private String name;
    private String id;
    private ArrayList<Pet> pets;

    public Person(String name, String id, ArrayList<Pet> pets) {
        this.name = name;
        this.id = id;
        this.pets = pets;
        for (Pet pet : pets) {
            pet.setOwner(this);    
        }
    }
    
    public void addPet(Pet newPet){
        pets.add(newPet);
        newPet.setOwner(this);
    }
    
    public void showPets(){
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", id=" + id + '}';
    }
    
    
    
}
