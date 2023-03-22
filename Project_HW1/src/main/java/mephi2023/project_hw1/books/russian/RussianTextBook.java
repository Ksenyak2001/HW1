/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.project_hw1.books.russian;

import java.util.ArrayList;
import java.util.Random;
import mephi2023.project_hw1.books.RussianBook;
import mephi2023.project_hw1.books.TextBook;
import mephi2023.project_hw1.reading.ReadingTitle;

/**
 *
 * @author Kseny
 */
public class RussianTextBook extends RussianBook implements TextBook{
    public 
        RussianTextBook(){
            System.out.println("Создался русский учебник");
            generateRandomRussianTextBook();
        }
    
    @Override
    public String getTitle(){
        return this.Title;
    }
    
    private void generateRandomRussianTextBook(){
        Random random = new Random();
        String totalTitle = "";
        ArrayList<String> TypesList = ReadingTitle.getTypes();
        ArrayList<String> DisciplinesRList = ReadingTitle.getDisciplinesR();
        int numb_type = random.nextInt(TypesList.size());
        totalTitle = TypesList.get(numb_type) + " по \"";
        int numb_discipline = random.nextInt(DisciplinesRList.size());
        String discipline = DisciplinesRList.get(numb_discipline);
        int idFirstWord = discipline.indexOf(" ");
        if (idFirstWord == -1){
            idFirstWord = discipline.length();
        }
        String firstWord = discipline.substring(0, idFirstWord);
        //System.out.println(firstWord);
        //System.out.println(otherWords);         
        if (firstWord.endsWith("ая") || firstWord.endsWith("ое") ||
            firstWord.endsWith("ые") || firstWord.endsWith("ый") ){
            String otherWords = discipline.substring(idFirstWord+1, discipline.length());
            int idSecondWord = otherWords.indexOf(" ");
            //System.out.println(idSecondWord);
            if (idSecondWord != -1){
                String secondWord = otherWords.substring(0, idSecondWord);
                totalTitle += (changeWordDP(firstWord) + " " + changeWordDP(secondWord) + " " +
                               otherWords.substring(idSecondWord + 1, otherWords.length()));
            }   else {
                String secondWord = otherWords.substring(0, otherWords.length());
                totalTitle += (changeWordDP(firstWord) + " " + changeWordDP(secondWord));
            }         
        } else if (idFirstWord != -1 && idFirstWord != discipline.length()) {
            totalTitle += (changeWordDP(firstWord) + " " + discipline.substring(idFirstWord+1, discipline.length()));
        } else {
            totalTitle += changeWordDP(firstWord);
        }       
        totalTitle += "\"";
        this.Title = totalTitle;
        //System.out.println(totalTitle);
    }
    
    private String changeWordDP(String word){
        String word_temp = word;
        if (word.endsWith("ая")){
            word_temp = word.substring(0, word.length()-2);
            word_temp += "ой";
        } else if (word.endsWith("ые")){
            word_temp = word.substring(0, word.length()-2);
            word_temp += "ым";
        } else if (word.endsWith("ое")){
            word_temp = word.substring(0, word.length()-2);
            word_temp += "ому";
        } else if (word.endsWith("ие")){
            word_temp = word.substring(0, word.length()-2);
            word_temp += "ию";
        } else if (word.endsWith("ия")){
            word_temp = word.substring(0, word.length()-2);
            word_temp += "ии";
        } else if (word.endsWith("ый")){
            word_temp = word.substring(0, word.length()-2);
            word_temp += "ому";
        } else if (word.endsWith("ы")){
            word_temp = word.substring(0, word.length()-1);
            word_temp += "ам";
        } else if (word.endsWith("а")){
            word_temp = word.substring(0, word.length()-1);
            word_temp += "е";
        } else if (word.endsWith("ь")){
            word_temp = word.substring(0, word.length()-1);
            word_temp += "и";
        } else if (word.endsWith("о")){
            word_temp = word.substring(0, word.length()-1);
            word_temp += "у";
        } else if (!word.endsWith(" ")){
            word_temp += "у";
        }
        return word_temp;
    }

}
