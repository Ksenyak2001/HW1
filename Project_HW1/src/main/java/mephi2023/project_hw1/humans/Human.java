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
        if (n. endsWith("�")) {
            p_temp = n.substring(0, n.length()-1);
            p_temp += "����";
        } 
        else if ((n. endsWith("�")) || (n. endsWith("�"))){} 
        else {
            p_temp = n;
            p_temp += "����";
        }          
        
        return p_temp;
    }
    
    protected String doOnePatronymicWoman(String n){
        String p_temp = "";
        if (n. endsWith("�")) {
            p_temp = n.substring(0, n.length()-1);
            p_temp += "����";
        } 
        else if ((n. endsWith("�")) || (n. endsWith("�"))){}
        else {
            p_temp = n;
            p_temp += "����";          
        }
        return p_temp;
    }
    
    protected String doOneSurnameWoman(String n){
        String s_temp = n;
        if (n. endsWith("��") || n. endsWith("��")) {
            s_temp = n.substring(0, n.length()-2);
            s_temp += "��";
        } else if ((n. endsWith("�")) || (n. endsWith("�")) ||
                   (n. endsWith("�")) || (n. endsWith("�")) ||
                   (n. endsWith("�")) || (n. endsWith("�")) ||
                   (n. endsWith("�")) || (n. endsWith("�")) ||
                   (n. endsWith("�")) || (n. endsWith("�")) ||
                   (n. endsWith("�")) || (n. endsWith("�"))){}
        else {
            s_temp = n;
            s_temp += "�";
        }            
        return s_temp;
    }
}
