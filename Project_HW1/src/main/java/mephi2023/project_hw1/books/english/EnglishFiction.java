/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.project_hw1.books.english;

import java.util.ArrayList;
import java.util.Random;
import mephi2023.project_hw1.books.EnglishBook;
import mephi2023.project_hw1.books.Fiction;
import mephi2023.project_hw1.reading.ReadingTitle;

/**
 *
 * @author Kseny
 */
public class EnglishFiction extends EnglishBook implements Fiction{
    public EnglishFiction(){
        System.out.println("Создалась английская литература");
        generateRandomEnglishFiction();
    }

    @Override
    public String getTitle(){
        return this.Title;
    }
    
    private void generateRandomEnglishFiction(){
        Random random = new Random();
        String totalTitle = "";
        
        ArrayList<ArrayList<String>> Types3List = ReadingTitle.getTypes3();
                
        totalTitle = Types3List.get(0).get(random.nextInt(Types3List.get(0).size())) + " " +
                     Types3List.get(1).get(random.nextInt(Types3List.get(1).size())) + " " +
                     Types3List.get(2).get(random.nextInt(Types3List.get(2).size()));
        //System.out.println(totalTitle);
        this.Title = totalTitle;
    }

}
