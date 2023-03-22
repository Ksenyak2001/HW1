/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.project_hw1.humans.student;

import mephi2023.project_hw1.humans.Person;
import mephi2023.project_hw1.humans.PersonFactory;

/**
 *
 * @author Kseny
 */
public class StudentFactory implements PersonFactory{
    @Override
    public Person createPerson() {
        return new Student();
    }    
    
    
}
