/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.project_hw1.reading;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Kseny
 */
public class ReadingTitle extends Reading{

    private static ArrayList<String> LevelList;
    private static ArrayList<String> TypesList;  
    private static ArrayList<String> DisciplinesRList;
    private static ArrayList<String> DisciplinesEList;
    private static ArrayList<String> AuthorsList;
    private static ArrayList<String> UnivercitiesList;
    private static ArrayList<ArrayList<String>> Types2List;
    private static ArrayList<ArrayList<String>> Types3List;
    private static ArrayList<String> HerosList;
    private static ArrayList<String> EndsList;
    
    public ReadingTitle(){
        LevelList = new ArrayList<>();
        TypesList = new ArrayList<>();  
        DisciplinesRList = new ArrayList<>();
        DisciplinesEList = new ArrayList<>();
        AuthorsList = new ArrayList<>();
        UnivercitiesList = new ArrayList<>();
        Types2List = new ArrayList<>();
        Types3List = new ArrayList<>();
        HerosList = new ArrayList<>();
        EndsList = new ArrayList<>();
    }
    public ReadingTitle(String file) throws IOException{
        LevelList = new ArrayList<>();
        TypesList = new ArrayList<>();  
        DisciplinesRList = new ArrayList<>();
        DisciplinesEList = new ArrayList<>();
        AuthorsList = new ArrayList<>();
        UnivercitiesList = new ArrayList<>();
        Types2List = new ArrayList<>();
        Types3List = new ArrayList<>();
        HerosList = new ArrayList<>();
        EndsList = new ArrayList<>();
        //levels
        this.readFromExcel(file, "levels", this.LevelList);
        //types
        this.readFromExcel(file, "types", this.TypesList);
        //disciplines russian
        this.readFromExcel(file, "disciplinesR", this.DisciplinesRList);
        //disciplines english
        this.readFromExcel(file, "disciplinesE", this.DisciplinesEList);
        //authors
        this.readFromExcel(file, "authors", this.AuthorsList);
        //univercities
        this.readFromExcel(file, "univercities", this.UnivercitiesList);
        //types2
        this.readFromExcel(file, "types2", this.Types2List, 5);
        //heros
        this.readFromExcel(file, "heros", this.HerosList);
        //ends
        this.readFromExcel(file, "ends", this.EndsList);
        //types3
        this.readFromExcel(file, "types3", this.Types3List, 4, true);
        
    }
    
    public static ArrayList<String> getDisciplinesR(){
        return DisciplinesRList;
    }
    public static ArrayList<String> getDisciplinesE(){
        return DisciplinesEList;
    }
    public static ArrayList<String> getAuthors(){
        return AuthorsList;
    }
    public static ArrayList<String> getUnivercities(){
        return UnivercitiesList;
    }
    public static ArrayList<String> getLevel(){
        return LevelList;
    }
    public static ArrayList<String> getHeros(){
        return HerosList;
    }
    public static ArrayList<String> getEnds(){
        return EndsList;
    }
    public static ArrayList<String> getTypes(){
        return TypesList;
    }
    public static ArrayList<ArrayList<String>> getTypes2(){
        return Types2List;
    }
    public static ArrayList<ArrayList<String>> getTypes3(){
        return Types3List;
    }
         
    private void readFromExcel(String file, String list, ArrayList<ArrayList<String>> al, int numbStr) throws IOException{
        XSSFWorkbook myExcelBook = new XSSFWorkbook(new FileInputStream(file));
        XSSFSheet myExcelSheet = myExcelBook.getSheet (list);
        XSSFRow row = myExcelSheet.getRow(0) ;
        int i = 0;
        while(row.getCell(i) != null && 
              row.getCell(i).getCellType() == CellType.STRING) {
            ArrayList<String> al_temp = new ArrayList<>();
            for (int j = 0; j < numbStr; ++j){
                XSSFRow row2 = myExcelSheet.getRow(j) ;
                //System.out.println(row2.getCell(i));
                if (row2.getCell(i) == null){
                    al_temp.add("");
                } else {
                    al_temp.add(row2.getCell(i).getStringCellValue() );
                }
            }
            al.add(al_temp);
            i += 1;
        }
        myExcelBook.close () ;
    }
    private void readFromExcel(String file, String list, ArrayList<ArrayList<String>> al, int numbStr, boolean eachStr) throws IOException{
        XSSFWorkbook myExcelBook = new XSSFWorkbook(new FileInputStream(file));
        XSSFSheet myExcelSheet = myExcelBook.getSheet (list);
        int i = 0;
        while(myExcelSheet.getRow(i) != null) {
            ArrayList<String> al_temp = new ArrayList<>();
            int j = 0;
            System.out.println(i);
            XSSFRow row = myExcelSheet.getRow(i) ;
            while(row.getCell(j) != null && 
                  row.getCell(j).getCellType() == CellType.STRING){
                                //System.out.println(row2.getCell(i));
                if (row.getCell(j) == null){
                    break;
                } else {
                    al_temp.add(row.getCell(j).getStringCellValue());
                }
                j += 1;
            }
            al.add(al_temp);
            i += 1;
        }
        myExcelBook.close () ;
    }
}
