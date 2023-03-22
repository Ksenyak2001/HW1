/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.project_hw1.humans;

import java.util.Comparator;

/**
 *
 * @author Kseny
 */
public class PersonComparator implements Comparator<Person>{ 
    @Override
    public int compare(Person a, Person b){
        return a.getName().compareTo(b.getName());
    }
}
