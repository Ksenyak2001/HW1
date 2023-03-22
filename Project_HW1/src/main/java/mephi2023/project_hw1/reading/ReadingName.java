/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.project_hw1.reading;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Kseny
 */
public class ReadingName extends Reading{
    private static ArrayList<String> NameList;
    private static ArrayList<String> SurnameList;  
    private static ArrayList<String> SurnameTeacherList;
    private static ArrayList<String> DepartmentList;
    private static int countMen = 0;
    
    public ReadingName(){
        NameList = new ArrayList<>();
        SurnameList = new ArrayList<>();
        SurnameTeacherList = new ArrayList<>();
        DepartmentList = new ArrayList<>();        
    }
    public ReadingName(String file) throws IOException{
        NameList = new ArrayList<>();
        SurnameList = new ArrayList<>();
        SurnameTeacherList = new ArrayList<>();
        DepartmentList = new ArrayList<>(); 
        
        //names
        readFromExcel(file,"names", this.NameList);
        countMen();
        //men patronymic
        //doPatronymicMen();
        //women patronymic
        //doPatronymicWomen();        
        //surnames
        readFromExcel(file,"surnames", this.SurnameList);
        //women surnames
        //doSurnamesWomen(this.SurnameList, this.SurnameWomenList);
        //surnames teacher
        readFromExcel(file,"surnames2", this.SurnameTeacherList);
        //women surnames teacher
        //doSurnamesWomen(this.SurnameTeacherList, this.SurnameWomenTeacherList);
        //departments        
        readFromExcel(file,"departments", this.DepartmentList);
    }
    private void countMen(){
        for (String n : this.NameList){
            if (n.endsWith("à") || n.endsWith("ÿ")){}
            else {
                this.countMen += 1;
            }
        }
    }
    
    public static ArrayList<String> getNames(){
        return NameList;
    }
    public static ArrayList<String> getSurnames(){
        return SurnameList;
    }
    public static ArrayList<String> getSurnamesTeacher(){
        return SurnameTeacherList;
    }
    public static ArrayList<String> getDepartments(){
        return DepartmentList;
    }
    public static int getCountMen(){
        return countMen;
    }   
        
}
