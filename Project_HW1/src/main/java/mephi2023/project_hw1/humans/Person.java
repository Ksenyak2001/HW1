/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mephi2023.project_hw1.humans;

import java.util.ArrayList;
import mephi2023.project_hw1.books.Bookable;

/**
 *
 * @author Kseny
 */
public interface Person extends Comparable<Person> {
    String getName();
    void setBookList(ArrayList<Bookable> visitorList);    
    ArrayList<Bookable> getBookList();
    Human getType();
}
