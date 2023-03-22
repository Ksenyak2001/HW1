/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi2023.project_hw1.books.russian;


import mephi2023.project_hw1.books.Fiction;
import mephi2023.project_hw1.books.TextBook;
import mephi2023.project_hw1.books.BookFactory;

/**
 *
 * @author Kseny
 */
public class RussianBookFactory implements BookFactory{
    @Override
    public TextBook createTextbook() {
        return new RussianTextBook();
    }

    @Override
    public Fiction createFiction() {
        return new RussianFiction();
    }
}
