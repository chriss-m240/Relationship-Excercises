/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Point_4;

/**
 *
 * @author Estudiante
 */
public class Person {
    
    private Date birthDate;

    public Person(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    public Date getBirthDate(){
        return this.birthDate;
    }
    
}
