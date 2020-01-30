package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    static int[] count1 = new int[28]; // 11 different "spaces" for ints
    static String[] letters = {"A","B","C","D","E","F","G","H","I","J","K"};


    public static void main(String[] args) throws FileNotFoundException {
        FileReader file = new FileReader("/Users/joenewman/IdeaProjects/Historgram/t1.rtf");
        Scanner scan = new Scanner(file);

        int count = 0;
        int CountA = 0; int CountB = 0; int CountC = 0; int CountD = 0; int CountE = 0;
        int CountF = 0; int CountG = 0; int CountH = 0; int CountI = 0; int CountJ = 0;
        int CountK = 0;


        System.out.println(scan.next());
        try {
            while (scan.hasNext()) {
                for (int i = 0; i < scan.nextLine().length(); i++) {
                    if (scan.next() == "A") {
                        CountA++;
                    }
                }

            }
            System.err.println(CountA);
        } catch(NoSuchElementException e)
        {
            System.err.println("No Char found");
        }
    }
}
