/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.project_hw1;

/**
 *
 * @author Kseny
 */
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import mephi2023.project_hw1.books.BookFactory;
import mephi2023.project_hw1.books.Bookable;
import mephi2023.project_hw1.books.english.EnglishBookFactory;
import mephi2023.project_hw1.books.russian.RussianBookFactory;
import mephi2023.project_hw1.humans.Person;
import mephi2023.project_hw1.humans.PersonComparator;
import mephi2023.project_hw1.humans.PersonFactory;
import mephi2023.project_hw1.humans.student.StudentFactory;
import mephi2023.project_hw1.humans.teacher.TeacherFactory;

public class DataManipulation {
    private ArrayList<Bookable> Library;
    private ArrayList<Person> Visitors;
    
    public DataManipulation() {
        Library = new ArrayList<>();
        Visitors = new ArrayList<>();
    }
    
    public int getSizeLibrary(){
        return Library.size();
    }
    public int getSizeVisitors(){
        return Visitors.size();
    }
    
    public void generateBookData(){
        BookFactory factory;
        int i = 0;
        while (i<100){
            factory = new RussianBookFactory();
            Library.add(factory.createFiction());
            i++;
        }
        i = 0;
        while (i<100){
            factory = new RussianBookFactory();
            Library.add(factory.createTextbook());
            i++;
        }
        i = 0;
        while (i<100){
            factory = new EnglishBookFactory();
            Library.add(factory.createFiction());
            i++;
        }
        i = 0;
        while (i<100){
            factory = new EnglishBookFactory();
            Library.add(factory.createTextbook());
            i++;
        }
        System.out.println(Library.size());
        ArrayList<String> names= new ArrayList<>();
        for (Bookable b : Library){
            names.add(b.getTitle());
        }
        System.out.println(names.size());
        Set<Bookable> BookList = new LinkedHashSet<>(Library); 
        
        Set<String> books = new LinkedHashSet<>(names); 
        System.out.println(books.size());
        
        Library = new ArrayList<>(BookList);
        System.out.println(Library.size());
    }
    
    public void generateHumanData(){
        PersonFactory factory;
        int i = 0;
        while (i<200){
            factory = new StudentFactory();
            Visitors.add(factory.createPerson());
            i++;
        }
        i = 0;
        while (i<200){
            factory = new TeacherFactory();
            Visitors.add(factory.createPerson());
            i++;
        }  
        System.out.println(Visitors.size());
        ArrayList<String> names= new ArrayList<>();
        for (Person p : Visitors){
            names.add(p.getName());
        }
        System.out.println(names.size());
        Set<Person> PersonList = new LinkedHashSet<>(Visitors); 
        
        Set<String> people = new LinkedHashSet<>(names); 
        System.out.println(people.size());
        
        Visitors = new ArrayList<>(PersonList);
        System.out.println(Visitors.size());
    }
    
    public void giveBookPerson(){
        for (Person p : this.Visitors){
            Random random = new Random();
            int count = random.nextInt(3, 11);            
            Set<Integer> numberBook = new LinkedHashSet<>(); 
            while(numberBook.size() != count){
                numberBook.add(random.nextInt(0,400));
            }
            ArrayList<Bookable> visitorList = new ArrayList<>();
            for (Integer i : numberBook){
                visitorList.add(Library.get(i));
            }
            p.setBookList(visitorList);
            System.out.println(count);
                    
        }
    }
    
    public ArrayList<Person> getVisitors(){
        PersonComparator p = new PersonComparator();
        Visitors.sort(p);
        return Visitors;
    }
}
