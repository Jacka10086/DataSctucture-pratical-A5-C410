package Queues;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

public class Queues {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Queue<Character> letters = new LinkedList<Character>();
        int[] occurrencnes = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                              0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        char thisChar;
        int arrayPos;

        System.out.print("Enter a phrase to check >");
        String inputStr = keyboard.nextLine();

        int i = 0;
        while (i < inputStr.length()) {
            thisChar = inputStr.charAt(i);
            arrayPos = (int)thisChar - (int)'a';
            occurrencnes[arrayPos]++;
            letters.add(thisChar);
            System.out.printf("%c goes at position %d\n", thisChar, arrayPos);
            i++;              
        }
       
        boolean finished = false;
        while(!letters.isEmpty()) {
            thisChar = letters.remove();
            arrayPos = (int)thisChar - (int)'a';
            if (occurrencnes[arrayPos] == 1) {
                System.out.printf("%c is the first non-repeating character\n", thisChar);
                finished = true;
                break;
            }
            }
            if (!finished) {
                System.out.println("There are no non-repeating characters");
        }
    }
} 