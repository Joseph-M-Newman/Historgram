package com.company;

import jdk.jfr.StackTrace;

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
                if (CurrentLine.equals("A")) {
                    CountA++;
                } else if (CurrentLine.equals("B")) {
                    CountB++;
                } else if (CurrentLine.equals("C")) {
                    CountC++;
                } else if (CurrentLine.equals("D")) {
                    CountD++;
                } else if (CurrentLine.equals("E")) {
                    CountE++;
                } else if (CurrentLine.equals("F")) {
                    CountF++;
                } else if (CurrentLine.equals("G")) {
                    CountG++;
                } else if (CurrentLine.equals("H")) {
                    CountH++;
                } else if (CurrentLine.equals("I")) {
                    CountI++;
                } else if (CurrentLine.equals("J")) {
                    CountJ++;
                } else if (CurrentLine.equals("K")) {
                    CountK++;
                } else if (CurrentLine.equals("L")) {
                    CountL++;
                } else if (CurrentLine.equals("M")) {
                    CountM++;
                } else if (CurrentLine.equals("N")) {
                    CountN++;
                } else if (CurrentLine.equals("O")) {
                    CountO++;
                } else if (CurrentLine.equals("P")) {
                    CountP++;
                } else if (CurrentLine.equals("Q")) {
                    CountQ++;
                } else if (CurrentLine.equals("R")) {
                    CountR++;
                } else if (CurrentLine.equals("S")) {
                    CountS++;
                } else if (CurrentLine.equals("T")) {
                    CountT++;
                } else if (CurrentLine.equals("U")) {
                    CountU++;
                } else if (CurrentLine.equals("V")) {
                    CountV++;
                } else if (CurrentLine.equals("W")) {
                    CountW++;
                } else if (CurrentLine.equals("X")) {
                    CountX++;
                } else if (CurrentLine.equals("Y")) {
                    CountY++;
                } else if (CurrentLine.equals("Z")) {
                    CountZ++;
                }
                //System.err.println(FileLength);
                //System.out.println(CurrentLine);  THESE ARE COMMENTS TO CHECK IF ALL IS GOING WELL; IF ANYTHING BREAKS @START_HERE
                //System.out.println(CountA);

            }
            count1[0] = CountA;
            count1[1] = CountB;
            count1[2] = CountC;
            count1[3] = CountD;
            count1[4] = CountE;
            count1[5] = CountF;
            count1[6] = CountG;
            count1[7] = CountH;
            count1[8] = CountI;
            count1[9] = CountJ;
            count1[10] = CountK;
            count1[11] = CountL;
            count1[12] = CountM;
            count1[13] = CountN;
            count1[14] = CountO;
            count1[15] = CountP;
            count1[16] = CountQ;
            count1[17] = CountR;
            count1[18] = CountS;
            count1[19] = CountT;
            count1[20] = CountU;
            count1[21] = CountV;
            count1[21] = CountW;
            count1[22] = CountX;
            count1[23] = CountY;
            count1[24] = CountZ;

            for (int i = 0; i < count1.length; i++) {
                System.out.println(count1[i]);
            }
        }catch (NoSuchElementException e) {
            System.err.println("No such Element Found..." + e);
        }

        //TODO DRAW UP THE HISTOGRAM

    }
}
