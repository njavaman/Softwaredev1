package Newsom_SpellChecker;
//Author Name: Miles Newsom
//Date: 1/30/2022
//Program Name: Newsom_SpellChecking
//Purpose: spell checking

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Newsom_SpellChecking
{
    public static void main(String[] args) throws FileNotFoundException
    {
        boolean noMatch = false;
        ArrayList<String> fileToCheck = new ArrayList<String>();
        ArrayList<String> dictionaryList = new ArrayList<String>();
        
        File checkFile = new File("fileToCheck.txt");
        File dictionaryFile = new File("dictionary.txt");
        
        Scanner scanner1 = new Scanner(checkFile);
        while (scanner1.hasNext())
        {
            fileToCheck.add(scanner1.next());
        }
        
        Scanner scanner2 = new Scanner(dictionaryFile);
        while (scanner2.hasNext())
        {
            dictionaryList.add(scanner2.next());
        }
        
        scanner1.close();
        scanner2.close();
        
        
        for(int i = 0; i < fileToCheck.size(); i++)
        {
            for (int j = 0; j < fileToCheck.size(); j++)
            {
                if (fileToCheck.get(i).equals(dictionaryList.get(j)))
                {
                    noMatch = true;
                }
            }
            if (noMatch == false)
            {
                System.out.println(fileToCheck.get(i) + " :What is this word???");
            }
        }
    }
}