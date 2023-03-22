/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.project_hw1.humans;

import mephi2023.project_hw1.books.Bookable;
import java.util.ArrayList;

/**
 *
 * @author Kseny
 */
public class Human {
    protected String Name = "";
    protected ArrayList<Bookable> Books;
        
    protected String doOnePatronymicMan(String n){
        String p_temp = "";
        if (n. endsWith("й")) {
            p_temp = n.substring(0, n.length()-1);
            p_temp += "евич";
        } 
        else if ((n. endsWith("а")) || (n. endsWith("я"))){} 
        else {
            p_temp = n;
            p_temp += "ович";
        }          
        
        return p_temp;
    }
    
    protected String doOnePatronymicWoman(String n){
        String p_temp = "";
        if (n. endsWith("й")) {
            p_temp = n.substring(0, n.length()-1);
            p_temp += "евна";
        } 
        else if ((n. endsWith("а")) || (n. endsWith("я"))){}
        else {
            p_temp = n;
            p_temp += "овна";          
        }
        return p_temp;
    }
    
    protected String doOneSurnameWoman(String n){
        String s_temp = n;
        if (n. endsWith("ий") || n. endsWith("ый")) {
            s_temp = n.substring(0, n.length()-2);
            s_temp += "ая";
        } else if ((n. endsWith("а")) || (n. endsWith("е")) ||
                   (n. endsWith("ё")) || (n. endsWith("и")) ||
                   (n. endsWith("о")) || (n. endsWith("у")) ||
                   (n. endsWith("ы")) || (n. endsWith("э")) ||
                   (n. endsWith("ю")) || (n. endsWith("я")) ||
                   (n. endsWith("ь")) || (n. endsWith("ъ"))){}
        else {
            s_temp = n;
            s_temp += "а";
        }            
        return s_temp;
    }
}
