/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.project_hw1.humans.teacher;

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
public class Teacher extends Human implements Person{
    public 
        Teacher(){
            System.out.println("Создался учитель");
            generateRandomTeacherName();
        }
    private void generateRandomTeacherName(){
        Random randomT = new Random();
        String totalName = doFIO();
        ArrayList<String> DepartmentList = ReadingName.getDepartments();
        int numb_department = randomT.nextInt(DepartmentList.size());
        totalName += " [";
        totalName += DepartmentList.get(numb_department);
        totalName += "]";
        
        System.out.println(totalName);
        this.Name = totalName;
    }
    
    private String doFIO (){
        String totalName = "";
        Random random = new Random();
        ArrayList<String> NameList = ReadingName.getNames();
        ArrayList<String> SurnameList = ReadingName.getSurnamesTeacher();
        
        int numb_name = random.nextInt(NameList.size());
        int numb_surname = random.nextInt(SurnameList.size());
        int numb_patronymic = random.nextInt(ReadingName.getCountMen());
        if (NameList.get(numb_name).endsWith("а") ||
            NameList.get(numb_name).endsWith("я")){
            totalName = doOneSurnameWoman(SurnameList.get(numb_surname)) + " " +
                        NameList.get(numb_name) + " " + 
                        doOnePatronymicWoman(NameList.get(numb_patronymic));
        } else {
            totalName = SurnameList.get(numb_surname) + " " +
                        NameList.get(numb_name) + " " + 
                        doOnePatronymicMan(NameList.get(numb_patronymic));
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
    public Teacher getType() {
        return new Teacher();
    }
    
    @Override
    public int compareTo(Person p) {
        return Name.compareTo(p.getName());
    }
}
