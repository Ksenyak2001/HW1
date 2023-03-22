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
public class Reading {
    protected void readFromExcel(String file, String list, ArrayList<String> al) throws IOException{
        XSSFWorkbook myExcelBook = new XSSFWorkbook(new FileInputStream(file));
        XSSFSheet myExcelSheet = myExcelBook.getSheet (list);
        XSSFRow row = myExcelSheet.getRow(0) ;
        int i = 0;
        while(row.getCell(i) != null && 
              row.getCell(i).getCellType() == CellType.STRING) {
            al.add(row.getCell(i).getStringCellValue() );
            String name = row.getCell(i).getStringCellValue() ;
            System.out.println(list+ " : " + name);
            i += 1;
        }
        myExcelBook.close () ;
    }
}
