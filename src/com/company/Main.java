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
        File file = new File("t1.txt");
        Scanner scan = new Scanner(file);


        int FileLength = 0;
        int CountA = 0; int CountB = 0; int CountC = 0; int CountD = 0; int CountE = 0;
        int CountF = 0; int CountG = 0; int CountH = 0; int CountI = 0; int CountJ = 0;
        int CountK = 0; int CountL = 0; int CountM = 0; int CountN = 0; int CountO = 0; int CountP = 0;
        int CountQ = 0; int CountR = 0; int CountS = 0; int CountT = 0; int CountU = 0;
        int CountV = 0; int CountW = 0; int CountX = 0; int CountY = 0; int CountZ = 0;
        String CurrentLine = "";
        try {
            while (scan.hasNextLine()) {
                CurrentLine = scan.nextLine();
                if (CurrentLine != null) {
                    FileLength++;
                }
                if (CurrentLine == "A") {
                    CountA++;
                }else if (CurrentLine == "B") {
                    CountB++;
                }else if (CurrentLine == "C") {
                    CountC++;
                }else if (CurrentLine == "D") {
                    CountD++;
                }else if (CurrentLine == "E") {
                    CountE++;
                }else if (CurrentLine == "F") {
                    CountF++;
                }else if (CurrentLine == "G") {
                    CountG++;
                }else if (CurrentLine == "H") {
                    CountH++;
                }else if (CurrentLine == "I") {
                    CountI++;
                }else if (CurrentLine == "J") {
                    CountJ++;
                }else if (CurrentLine == "K") {
                    CountK++;
                }else if (CurrentLine == "L") {
                    CountL++;
                }else if (CurrentLine == "M") {
                    CountM++;
                }else if (CurrentLine == "N") {
                        CountN++;
                }else if (CurrentLine == "O") {
                        CountO++;
                }else if (CurrentLine == "P") {
                        CountP++;
                }else if (CurrentLine == "Q") {
                        CountQ++;
                }else if (CurrentLine == "R") {
                        CountR++;
                }else if (CurrentLine == "S") {
                        CountS++;
                }else if (CurrentLine == "T") {
                        CountT++;
                }else if (CurrentLine == "U") {
                        CountU++;
                }else if (CurrentLine == "V") {
                        CountV++;
                }else if (CurrentLine == "W") {
                        CountW++;
                }else if (CurrentLine == "X") {
                        CountX++;
                }else if (CurrentLine == "Y") {
                        CountY++;
                }else if (CurrentLine == "Z") {
                        CountZ++;
                }
                System.err.println(FileLength);
                System.out.println(CountA);
                System.out.println(CountZ);
            }
        }catch (NoSuchElementException e) {
            System.err.println("No such Element Found..." + e);
        }

               /* count1[0] = CountA; count1[1] = CountB; count1[2] = CountC;count1[3] = CountD;count1[4] = CountE;
                count1[5] = CountF; count1[6] = CountG;*/


        }
}
