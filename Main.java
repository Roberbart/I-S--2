/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata01;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Roberbart
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person person = new Person("Rober Bart", LocalDate.of(1999, Month.JULY, 27));
        System.out.println(person.getName() + " " + person.getAge());
    }
    
}

