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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date birthDate = new Date(20,01,1999);
        Person Cristian = new Person(birthDate);
        System.out.println(Cristian.getBirthDate().isLeapYear());
        // TODO code application logic here
    }
    
}
