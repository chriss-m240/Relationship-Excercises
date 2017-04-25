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
public abstract class Pet {
    protected String type;
    private String id;
    private String name;
    private String hairColor;
    private Person owner;

    public String getId() {
        return id;
    } 

    public void setOwner(Person owner) {
        this.owner = owner;
    }
    
    public Pet(String id, String name, String hairColor) {
        this.id = id;
        this.name = name;
        this.hairColor = hairColor;
    }
     
    public abstract String sound();

    @Override
    public String toString() {
        return "Animal Type = " + type + ", Name = " + name + ", id = " + id + ", Hair Color = " + hairColor + ", owner = " + owner;
    }

   
    
    
}
