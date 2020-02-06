/**
 * @title Histogram.java
 * @author Joseph Newman
 * @since 1/27/20
 * Histogram - Write a Java program called Histogram.java that displays a list of distinct
 * characters in an input file and the occurrence of each character.
 * Your program should read an input file name from a user.
 * After that, your program should read characters in the file and
 * display a list of distinct characters and their occurrences.
 * Finally, your program should draw a vertical bar for the occurrences.
 */
package com.company;


import javax.sound.midi.SysexMessage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Histogram {
    //Delcare arrays to store Chars and Count total for each separate variable
    static int[] count1 = new int[25]; // 11 different "spaces" for ints
    static String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
            "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};


    public static void main(String[] args) throws FileNotFoundException {
        String FileName = "t1.txt";
        File file = new File(FileName);
        Scanner scan = new Scanner(file);
        //declare majority of the int variables needed for keeping count;
        int Array_length = count1.length;
        int FileLength = 0;
        int Highest_Value = count1[0];
        int CountA = 0;
        int CountB = 0;
        int CountC = 0;
        int CountD = 0;
        int CountE = 0;
        int CountF = 0;
        int CountG = 0;
        int CountH = 0;
        int CountI = 0;
        int CountJ = 0;
        int CountK = 0;
        int CountL = 0;
        int CountM = 0;
        int CountN = 0;
        int CountO = 0;
        int CountP = 0;
        int CountQ = 0;
        int CountR = 0;
        int CountS = 0;
        int CountT = 0;
        int CountU = 0;
        int CountV = 0;
        int CountW = 0;
        int CountX = 0;
        int CountY = 0;
        int CountZ = 0;
        String CurrentLine = "";
        //try to read each line from t1.txt and keeping count of each occurance of the char
        try {
            while (scan.hasNextLine()) {
                CurrentLine = scan.nextLine();
                if (CurrentLine != null) {
                    FileLength++;
                }
                try {
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
                } catch (NullPointerException e) {
                    System.out.println("No Letter found.." + e);

                }
                //System.err.println(FileLength);
                //System.err.println(CurrentLine);  THESE ARE COMMENTS TO CHECK IF ALL IS GOING WELL; IF ANYTHING BREAKS @START_HERE
                //System.err.println(CountA);

            }
            //store the counts within the array
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

            /*for (int i = 0; i < count1.length; i++) {
                System.out.println(count1[i]);        // THIS CHECKS IF ALL NUMBERS IN ARRAY ARE DISPLAYED PROPERLY;
            }*/
        } catch (NoSuchElementException e) {
            System.err.println("No such Element Found..." + e);
        }
        //set theHighest Value;
        for (int i = 0; i < count1.length; i++) {
            if (count1[i] > Highest_Value)
                Highest_Value = count1[i];
        }
        //bubble sort
        for (int i = 0; i < Array_length; i++) {
            for (int j = 0; j < Array_length - i - 1; j++) {
                if (count1[j] > count1[j + 1]) {
                    String tempstring = letters[j];
                    letters[j] = letters[j + 1];
                    letters[j + 1] = tempstring;
                    int temp = count1[j];
                    count1[j] = count1[j + 1];
                    count1[j + 1] = temp;

                }
            }
        }
//        for (int i = 0; i < count1.length; i++) {
//            System.out.println(letters[i]);    THIS CHECKS IF ALL LETTERS IN ARRAY ARE DISPLAYED PROPERLY;
//        }


        //Below is the previous version of drawing up the final output; After talking to angelo, IT WAS A NO GO :C
      /*  System.out.println("============= Vertical Bar =================================");
        System.out.println("7  |");
        System.out.println("6  |");
        System.out.println("5  |");
        System.out.println("4  |");
        System.out.println("3  |");
        System.out.println("2  |");
        System.out.println("1  |");
        System.out.println("============================================================");
        System.out.print("");
        for (int i = 0; i < count1.length + 1; i++) {
            System.out.print(letters[i] + " ");
        }*/

        //BEGIN OUTPUT PROCEDURE;
        System.out.println("============= Vertical Bar =================================");
        int max = 0;
        //GET MAX COUNT;
        for (int i : count1)
            if (i > max)
                max = i;
        //DISPLAY THE NUMBER COUNT FROM HIGHEST TO LOWEST, AS WELL AS KEEPING THE * ON THE SAME PRINTED LINE;
        //such a FRUSTRATING process :C
        for (int j = max; j >= 1; j--) {
            String val = "|" + j + "|";
            for (int k = 0; k < count1.length; k++) {
                if (count1[k] >= j)
                    val += " *";
                else
                    val += "  ";

            }
            System.out.println(val);
        }
        System.out.print("    ");
        for (int i = 0; i < count1.length + 1; i++) {
            System.out.print(letters[i] + " ");

        }
    }
}
