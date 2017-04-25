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
public class Vet {
    
    private ArrayList<Pet> pets;

    public Vet() {
        this.pets = new ArrayList<>();
    }
    
    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }
    
    public void removePet(Pet pet){
         pets.remove(pet);
    }
    
    public void showPetsByType(String type){
        System.out.println(type + "s in the vet:");
        if ("Cat".equals(type) || "cat".equals(type))   
            for (Pet pet : pets) {
                if (pet instanceof Cat) {
                    System.out.println(pet.toString());
                } 
            }
        if ("Dog".equals(type) || "dog".equals(type))   
            for (Pet pet : pets) {
                if (pet instanceof Dog) {
                    System.out.println(pet.toString());
                }

            }
        if ("Hamster".equals(type) || "hamster".equals(type))
            for (Pet pet : pets) {
                if (pet instanceof Hamster) {
                    System.out.println(pet.toString());
                }
            }
    }
    
    public void showPets(){
        System.out.println("Pets in the vet:");
        for (Pet pet : pets) {
            System.out.println(pet.toString());
        }
    }
}
