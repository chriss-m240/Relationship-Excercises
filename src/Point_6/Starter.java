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
public class Starter {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vet Animalia = new Vet();
        // Pets
        Dog Lambda = new Dog("30", "Lambda", "Golden", "Chow-chow");
        Hamster Lychie = new Hamster("15", "Lychie", "White and Brown", 30);
        Cat Delta = new Cat("4", "Delta", "Orange", true);
        
        // Asigning pets to a Vet 
        ArrayList<Pet> VetPets = new ArrayList<>();
        VetPets.add(Delta);
        VetPets.add(Lychie);
        VetPets.add(Lambda);
        
        Animalia.setPets(VetPets);
        // Asigning pets to a Person
        ArrayList<Pet> ChrisPets = new ArrayList<>();
        ChrisPets.add(Lambda);
        
        ArrayList<Pet> InnaPets = new ArrayList<>();
        InnaPets.add(Lychie);
        
        Person Chris = new Person("Chris", "1032502457", ChrisPets);
        Chris.addPet(Delta);
        Person Inna = new Person("Inna", "99012014240", InnaPets);
        
        Animalia.showPets();
        Animalia.showPetsByType("Cat");
        Animalia.removePet(Lychie);
        Animalia.showPets();
        
        System.out.println(Lychie.sound());
        System.out.println(Lambda.sound());
        System.out.println(Delta.sound());
    }
    
}
