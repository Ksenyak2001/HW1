/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.project_hw1.humans.student;

import java.util.ArrayList;
import java.util.Random;
import mephi2023.project_hw1.books.Bookable;
import mephi2023.project_hw1.humans.Human;
import mephi2023.project_hw1.humans.Person;
import mephi2023.project_hw1.reading.ReadingName;

/**
 *
 * @author Kseny
 */
public class Student extends Human implements Person{        
    public 
        Student(){
            System.out.println("Создался студент");
            generateRandomStudentName();
        }
        
    private void generateRandomStudentName(){
        String totalName = doFI();               
        System.out.println(totalName);
        this.Name=totalName;
    }
    
    private String doFI (){
        String totalName = "";
        Random random = new Random();        
        ArrayList<String> NameList = ReadingName.getNames();
        ArrayList<String> SurnameList = ReadingName.getSurnames();
        
        int numb_name = random.nextInt(NameList.size());
        int numb_surname = random.nextInt(SurnameList.size());
        if (NameList.get(numb_name).endsWith("а") ||
            NameList.get(numb_name).endsWith("я")){
            totalName = doOneSurnameWoman(SurnameList.get(numb_surname)) + " " +
                        NameList.get(numb_name);
        } else {
            totalName = SurnameList.get(numb_surname) + " " +
                        NameList.get(numb_name);
        }
        return totalName;
    }

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public void setBookList(ArrayList<Bookable> visitorList) {
        this.Books = visitorList;
    }
    
    @Override
    public ArrayList<Bookable> getBookList() {
        return this.Books;
    }

    @Override
    public Student getType() {
        return new Student();
    }

    @Override
    public int compareTo(Person p) {
        return Name.compareTo(p.getName());
    }

    
}
