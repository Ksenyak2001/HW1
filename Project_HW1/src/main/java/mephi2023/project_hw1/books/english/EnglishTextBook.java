/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.project_hw1.books.english;

import java.util.ArrayList;
import java.util.Random;
import mephi2023.project_hw1.books.EnglishBook;
import mephi2023.project_hw1.books.TextBook;
import mephi2023.project_hw1.reading.ReadingTitle;

/**
 *
 * @author Kseny
 */
public class EnglishTextBook extends EnglishBook implements TextBook{
    public 
        EnglishTextBook(){
            System.out.println("Создался английский учебник");
            generateRandomEnglishTextBook();
        }
    
    @Override
    public String getTitle(){
        return this.Title;
    }
    
    private void generateRandomEnglishTextBook(){
        Random random = new Random();
        String totalTitle = "";
        
        ArrayList<String> DisciplinesEList = ReadingTitle.getDisciplinesE();
        ArrayList<String> AuthorsList = ReadingTitle.getAuthors();
        ArrayList<String> UnivercitiesList = ReadingTitle.getUnivercities();
        ArrayList<String> LevelList = ReadingTitle.getLevel();
        
        totalTitle = "\"" + DisciplinesEList.get(random.nextInt(DisciplinesEList.size())) + "\" " +
                     AuthorsList.get(random.nextInt(AuthorsList.size())) + ", " +
                     UnivercitiesList.get(random.nextInt(UnivercitiesList.size())) + ", " +
                     LevelList.get(random.nextInt(LevelList.size()));
        //System.out.println(totalTitle);
        this.Title = totalTitle;
    }

}