/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.project_hw1.books.russian;

import java.util.ArrayList;
import java.util.Random;
import mephi2023.project_hw1.books.Fiction;
import mephi2023.project_hw1.books.RussianBook;
import mephi2023.project_hw1.reading.ReadingTitle;

/**
 *
 * @author Kseny
 */
public class RussianFiction extends RussianBook implements Fiction {
    public RussianFiction(){
        System.out.println("��������� ������� ����������");
        generateRandomRussianFiction();
    }
    
    @Override
    public String getTitle(){
        return this.Title;
    }
    
    private void generateRandomRussianFiction(){
        Random random = new Random();
        ArrayList<ArrayList<String>> Types2List = ReadingTitle.getTypes2();
        int numb_type = random.nextInt(Types2List.size());
        ArrayList<String> structureTitle = Types2List.get(numb_type);
        ArrayList<String> HerosList = ReadingTitle.getHeros();
        ArrayList<String> EndsList = ReadingTitle.getEnds();
        
        String totalTitle = addWord1(structureTitle);
        totalTitle += addWord2(structureTitle, HerosList);    
        totalTitle += addWord3(structureTitle);
        totalTitle += addWord4(structureTitle, HerosList, EndsList);
        this.Title = totalTitle;
        //System.out.println(totalTitle);
        //resList.add(totalTitle);
    }
    
    private String addWord1(ArrayList<String> structureTitle){
        String totalTitle = structureTitle.get(0) ;
        if ((structureTitle.get(1).equals(","))){
            totalTitle +=  (structureTitle.get(1) + " ");
        } else if (!(structureTitle.get(1).equals(""))){
            totalTitle +=  (" " + structureTitle.get(1) + " ");
        } else {
            totalTitle += " ";
        }
        return totalTitle;
        
    }
    private String addWord2(ArrayList<String> structureTitle, ArrayList<String> HerosList){
        Random random = new Random();
        String totalTitle = "";
        switch(structureTitle.get(2)){
            case("���") ->{
                totalTitle += HerosList.get(random.nextInt(HerosList.size()));
                break;
            }
            case("����") ->{
                String nameHero = HerosList.get(random.nextInt(HerosList.size()));
                int idFirstWord = nameHero.indexOf(" ");
                if (idFirstWord != -1){
                    totalTitle += doWordRP(nameHero.substring(0, idFirstWord), true);
                    totalTitle += " ";
                    totalTitle += doWordRP(nameHero.substring(idFirstWord + 1, nameHero.length()), false);
                } else {
                    totalTitle += doWordRP(nameHero, true);
                }                
                break;
            }
            case("���") ->{
                String nameHero = HerosList.get(random.nextInt(HerosList.size()));
                int idFirstWord = nameHero.indexOf(" ");
                if (idFirstWord != -1){
                    totalTitle += doWordTP(nameHero.substring(0, idFirstWord), true);
                    totalTitle += " ";
                    totalTitle += doWordTP(nameHero.substring(idFirstWord + 1, nameHero.length()), false);
                } else {
                    totalTitle += doWordTP(nameHero, true);
                } 
                break;
            }
            case("���") ->{
                String nameHero = HerosList.get(random.nextInt(HerosList.size()));
                int idFirstWord = nameHero.indexOf(" ");
                if (idFirstWord != -1){
                    totalTitle += doWordPP(nameHero.substring(0, idFirstWord), true);
                    totalTitle += " ";
                    totalTitle += doWordPP(nameHero.substring(idFirstWord + 1, nameHero.length()), false);
                } else {
                    totalTitle += doWordPP(nameHero, true);
                } 
                break;
            }
        }
        return totalTitle;
    }
    
    private String addWord3(ArrayList<String> structureTitle){
        String totalTitle = "";
        if ((structureTitle.get(3).equals(","))){
            totalTitle +=  (structureTitle.get(3) + " ");
        } else if (!(structureTitle.get(3).equals(""))){
            if (structureTitle.get(3).equals("�")){
                totalTitle +=  (" �");
            } else {
                totalTitle +=  (" " + structureTitle.get(3) + " ");
            }
        }
        return totalTitle;
    }
    
    private String addWord4(ArrayList<String> structureTitle, ArrayList<String> HerosList, 
                           ArrayList<String> EndsList){
        Random random = new Random();
        String totalTitle = "";
        if (!structureTitle.get(4).equals("") && (structureTitle.get(3).equals(""))){
            totalTitle += " ";
        }
        String nameThing = EndsList.get(random.nextInt(EndsList.size()));
        String name = HerosList.get(random.nextInt(HerosList.size()));
        if (structureTitle.get(3).equals("�") && 
                (name.toLowerCase().startsWith("�") ||
                 name.toLowerCase().startsWith("�") ||
                 name.toLowerCase().startsWith("�") ||
                 name.toLowerCase().startsWith("�") ||
                 name.toLowerCase().startsWith("�") ||
                 name.toLowerCase().startsWith("�") ||
                 name.toLowerCase().startsWith("�") ||
                 name.toLowerCase().startsWith("�") ||
                 name.toLowerCase().startsWith("�") ||
                 name.toLowerCase().startsWith("�"))){
                totalTitle +=  ("� ");
            } else {
                totalTitle +=  (" ");
            }
        int idFirstWordThing = nameThing.indexOf(" ");
        int idFirstWord = name.indexOf(" ");
        switch(structureTitle.get(4)){
            case("���") ->{
                totalTitle += EndsList.get(random.nextInt(EndsList.size()));
                break;
            }
            case("����") ->{
                if (idFirstWordThing != -1){
                    totalTitle += doWordThingRP(nameThing.substring(0, idFirstWordThing), true);
                    totalTitle += " ";
                    totalTitle += doWordThingRP(nameThing.substring(idFirstWordThing + 1, nameThing.length()), false);
                } else {
                    totalTitle += doWordThingRP(nameThing, true);
                }    
                break;
            }
            case("���") ->{
                if (idFirstWordThing != -1){
                    totalTitle += doWordThingTP(nameThing.substring(0, idFirstWordThing), true);
                    totalTitle += " ";
                    totalTitle += doWordThingTP(nameThing.substring(idFirstWordThing + 1, nameThing.length()), false);
                } else {
                    totalTitle += doWordThingTP(nameThing, true);
                } 
                break;
            }
            case("���") ->{
                if (idFirstWordThing != -1){
                    totalTitle += doWordThingPP(nameThing.substring(0, idFirstWordThing), true);
                    totalTitle += " ";
                    totalTitle += doWordThingPP(nameThing.substring(idFirstWordThing + 1, nameThing.length()), false);
                } else {
                    totalTitle += doWordThingPP(nameThing, true);
                } 
                break;
            }
            case("����") ->{
                if (idFirstWord != -1){
                    totalTitle += doWordRP(name.substring(0, idFirstWord), true);
                    totalTitle += " ";
                    totalTitle += doWordRP(name.substring(idFirstWord + 1, name.length()), false);
                } else {
                    totalTitle += doWordRP(name, true);
                } 
                break;
            }
            case("���") ->{
                if (idFirstWord != -1){
                    totalTitle += doWordTP(name.substring(0, idFirstWord), true);
                    totalTitle += " ";
                    totalTitle += doWordTP(name.substring(idFirstWord + 1, name.length()), false);
                } else {
                    totalTitle += doWordTP(name, true);
                } 
                break;
            }
        }
        return totalTitle;
    }
    
    private String doWordThingRP(String word, boolean firstly){
        String word_temp = word;
        if (firstly){
            if ( word. endsWith("��")){
                word_temp = word.substring(0, word.length()-2);
                word_temp += "���";
            } else if (word.endsWith("�")){
                word_temp = word.substring(0, word.length()-1);
                word_temp += "�";
            } else if (word.endsWith("��")){
                word_temp = word.substring(0, word.length()-2);
                word_temp += "���";
            } else if (word.endsWith("�")){
                word_temp = word.substring(0, word.length()-1);
                word_temp += "�";
            } else if (word.endsWith("�") || word.endsWith("�")){
            } else {
                word_temp += "�";
            }
        } else{
            if ( word. endsWith("���")){
                word_temp = word.substring(0, word.length()-3);
                word_temp += "��";
            } else if (word.endsWith("�") || word.endsWith("�") || 
                       word.endsWith("�") || word.endsWith("�")){
            } else if (word.endsWith("�")){
                word_temp = word.substring(0, word.length()-1);
                word_temp += "�";
            } else {
                word_temp += "�";
            } 
        }
        return word_temp;
    }    
    private String doWordThingTP(String word, boolean firstly){
        String word_temp = word;
        if (firstly){
            if ( word. endsWith("��")){
                word_temp = word.substring(0, word.length()-2);
                word_temp += "��";
            } else if (word.endsWith("�")){
                word_temp = word.substring(0, word.length()-1);
                word_temp += "��";
            } else if (word.endsWith("��")){
                word_temp = word.substring(0, word.length()-2);
                word_temp += "��";
            } else if (word.endsWith("�")){
                word_temp = word.substring(0, word.length()-1);
                word_temp += "��";
            } else if (word.endsWith("�") || word.endsWith("�")
                       || word.endsWith("�")){
            } else {
                word_temp += "��";
            }
        } else{
            if ( word. endsWith("���")){
                word_temp = word.substring(0, word.length()-3);
                word_temp += "���";
            } else if (word.endsWith("�") || word.endsWith("�") || 
                       word.endsWith("�") || word.endsWith("�")){
            } else if (word.endsWith("�")){
                word_temp = word.substring(0, word.length()-1);
                word_temp += "��";
            } else {
                word_temp += "��";
            } 
        }
        return word_temp;
    }
    
    private String doWordThingPP(String word, boolean firstly){
        String word_temp = word;
        if (firstly){
            if ( word. endsWith("��")){
                word_temp = word.substring(0, word.length()-2);
                word_temp += "��";
            } else if (word.endsWith("�")){
                word_temp = word.substring(0, word.length()-1);
                word_temp += "�";
            } else if (word.endsWith("��")){
                word_temp = word.substring(0, word.length()-2);
                word_temp += "��";
            } else if (word.endsWith("�")){
                word_temp = word.substring(0, word.length()-1);
                word_temp += "�";
            } else if (word.endsWith("�") || word.endsWith("�")
                       || word.endsWith("�")){
            } else {
                word_temp += "�";
            }
        } else{
            if ( word. endsWith("���")){
                word_temp = word.substring(0, word.length()-3);
                word_temp += "��";
            } else if (word.endsWith("�") || word.endsWith("�") || 
                       word.endsWith("�") || word.endsWith("�")){
            } else if (word.endsWith("�")){
                word_temp = word.substring(0, word.length()-1);
                word_temp += "�";
            } else {
                word_temp += "�";
            } 
        }
        return word_temp;
    }
    
    
    private String doWordRP(String word, boolean firstly){
        String word_temp = word;
        if (firstly){
            if ( (word. endsWith("�")) ||
                 (word. endsWith("�")) || (word. endsWith("�")) ||
                 (word. endsWith("�")) || (word. endsWith("�")) ||
                 (word. endsWith("�")) || (word. endsWith("�")) ||
                 (word. endsWith("�")) || (word. endsWith("�"))){
            } else if (word.endsWith("�")){
                word_temp = word.substring(0, word.length()-1);
                word_temp += "�";
            } else if (word.endsWith("�")){
                word_temp = word.substring(0, word.length()-1);
                word_temp += "�";
            } else {
                word_temp += "�";
            } 
        } else{
            if ( (word. endsWith("�")) ||
                 (word. endsWith("�")) || (word. endsWith("�")) ||
                 (word. endsWith("�")) || (word. endsWith("�")) ||
                 (word. endsWith("�")) || (word. endsWith("�")) ||
                 (word. endsWith("�")) || (word. endsWith("�"))){
            } else if (word.endsWith("�")){
                word_temp = word.substring(0, word.length()-1);
                word_temp += "��";
            } else if (word.endsWith("���")){
                word_temp = word.substring(0, word.length()-2);
                word_temp += "��";
            } else if (word.endsWith("�")){
                word_temp = word.substring(0, word.length()-1);
                word_temp += "�";
            } else {
                word_temp += "�";
            }
        }
        return word_temp;
    }
    private String doWordTP(String word, boolean firstly){
        String word_temp = word;
        if ( (word. endsWith("�")) ||
             (word. endsWith("�")) || (word. endsWith("�")) ||
             (word. endsWith("�")) || (word. endsWith("�")) ||
             (word. endsWith("�")) || (word. endsWith("�")) ||
             (word. endsWith("�")) || (word. endsWith("�"))){
        } else if (word.endsWith("�")){
            word_temp = word.substring(0, word.length()-1);
            word_temp += "��";
        } else if (word.endsWith("���")){
                word_temp = word.substring(0, word.length()-2);
                word_temp += "���";
        } else if (word.endsWith("�")){
                word_temp = word.substring(0, word.length()-1);
                word_temp += "��";
        } else {
            
            word_temp += "��";
        } 
        return word_temp;
    }
    private String doWordPP(String word, boolean firstly){
        String word_temp = word;
        if (firstly){
            if ( (word. endsWith("�")) ||
                 (word. endsWith("�")) || (word. endsWith("�")) ||
                 (word. endsWith("�")) || (word. endsWith("�")) ||
                 (word. endsWith("�")) || (word. endsWith("�")) ||
                 (word. endsWith("�")) || (word. endsWith("�"))){
            } else if (word.endsWith("�")){
                word_temp = word.substring(0, word.length()-1);
                word_temp += "�";
            } else if (word.endsWith("�")){
                word_temp = word.substring(0, word.length()-1);
                word_temp += "�";
            } else {
                word_temp += "�";
            } 
        } else{
            if ( (word. endsWith("�")) ||
                 (word. endsWith("�")) || (word. endsWith("�")) ||
                 (word. endsWith("�")) || (word. endsWith("�")) ||
                 (word. endsWith("�")) || (word. endsWith("�")) ||
                 (word. endsWith("�")) || (word. endsWith("�"))){
            } else if (word.endsWith("�")){
                word_temp = word.substring(0, word.length()-1);
                word_temp += "��";
            } else if (word.endsWith("���")){
                word_temp = word.substring(0, word.length()-2);
                word_temp += "��";
            } else if (word.endsWith("��")){
                word_temp = word.substring(0, word.length()-1);
                word_temp += "�";
            }  else if (word.endsWith("��")){
                word_temp = word.substring(0, word.length()-1);
                word_temp += "�";
            } else if (word.endsWith("�")){
                word_temp = word.substring(0, word.length()-1);
                word_temp += "�";
            } else {
                word_temp += "�";
            }
        }
        return word_temp;
    }

}
