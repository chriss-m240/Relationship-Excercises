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
public class Date {
    
    private Integer day;
    private Integer month;
    private Integer year;
    public static String[] namesDay;
    public static String[] namesMonths;

    public Date(Integer day, Integer month, Integer year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

  
    public boolean isLeapYear(){
        
        if ((this.year % 4 == 0) && this.year % 100 != 0){
            return true;
        }
        else if (this.year % 400 == 0) {
            return true;
        }
        else{
            return false;
        }
    }
}
