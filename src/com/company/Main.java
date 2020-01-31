package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    static int[] count1 = new int[28]; // 11 different "spaces" for ints
    static String[] letters = {"A","B","C","D","E","F","G","H","I","J","K"};



    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/joenewman/IdeaProjects/Historgram/t1.txt");
        Scanner scan = new Scanner(file);

        int FileLength = 0;
        int CountA = 0; int CountB = 0; int CountC = 0; int CountD = 0; int CountE = 0;
        int CountF = 0; int CountG = 0; int CountH = 0; int CountI = 0; int CountJ = 0;
        int CountK = 0;
        String CurrentLine = "";
        while(scan.nextLine() != null){
            CurrentLine = scan.next();
            if(CurrentLine != null) {
                FileLength++;
            }
        }

       for (int g = 0; g < FileLength; g++) {
           System.out.println(scan.nextLine());
       }
        try {
            while (scan.hasNext()) {
                for (int i = 0; i < scan.nextLine().length(); i++) {
                    if (scan.next() == "A") {
                        CountA++;
                    }
                    if(scan.next() == "B")
                    {
                        CountB++;
                    }
                    if (scan.next() == "C")
                    {
                        CountC++;
                    }
                    if(scan.next() == "D")
                    {
                        CountD++;
                    }
                    if(scan.next() == "E")
                    {
                        CountE++;
                    }
                    if (scan.next() == "F") {
                        CountF++;
                    }
                    if(scan.next() == "G")
                    {
                        CountG++;
                    }
                    if (scan.next() == "H")
                    {
                        CountH++;
                    }
                    if(scan.next() == "I")
                    {
                        CountI++;
                    }
                    if(scan.next() == "J")
                    {
                        CountJ++;
                    }
                    
                }
                count1[0] = CountA; count1[1] = CountB; count1[2] = CountC;count1[3] = CountD;count1[4] = CountE;
                count1[5] = CountF; count1[6] = CountG;
            }
            System.err.println(CountA);
        } catch(NoSuchElementException e)
        {
            System.err.println("No Char found");
        }
    }
}
