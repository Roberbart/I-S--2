/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata01;

import java.time.LocalDate;

/**
 *
 * @author Roberbart
 */
public class Person {
    private final  String name;
    private final  LocalDate birthdate;
    
    
    public Person (String name, LocalDate birthdate){
        this.name = name;
        this.birthdate = birthdate;
    }

    Person() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public String getName(){
        return name;
    }
    
    public LocalDate getBirthDate(){
        return birthdate;
    }
    
    public int getAge(){
        return toYears(LocalDate.now().toEpochDay() - birthdate.toEpochDay());
    }

    private int toYears(long l) {
        return (int) l/365;
    }
}

