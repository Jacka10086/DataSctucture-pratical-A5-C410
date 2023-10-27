package Queues;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

public class Queues {

    public static void main(String[] args) {
        // 创建一个从键盘读取输入的Scanner对象
        Scanner keyboard = new Scanner(System.in);
        
        // 创建一个队列来存储输入字符串中的字符
        Queue<Character> letters = new LinkedList<Character>();
        
        // 创建一个整数数组来存储每个字母的出现次数
        // 数组索引对应于字母在字母表中的位置（a对应0，b对应1，...，z对应25）
        int[] occurrencnes = new int[26]; 

        char thisChar;
        int arrayPos;

        // 提示用户输入一个短语
        System.out.print("Enter a phrase to check >");
        String inputStr = keyboard.nextLine();

        int i = 0;
        // 遍历输入字符串的每个字符
        while (i < inputStr.length()) {
            thisChar = inputStr.charAt(i);
            
            // 计算当前字符在occurrencnes数组中的位置
            arrayPos = (int)thisChar - (int)'a';
            
            // 在相应的位置上增加字符出现的次数
            occurrencnes[arrayPos]++;
            
            // 将字符添加到letters队列
            letters.add(thisChar);
            
            // 打印字符及其在occurrencnes数组中的位置
            System.out.printf("%c goes at position %d\n", thisChar, arrayPos);
            i++;              
        }

        boolean finished = false;
        
        // 从队列中依次取出字符
        while(!letters.isEmpty()) {
            thisChar = letters.remove();
            
            // 再次计算字符在occurrencnes数组中的位置
            arrayPos = (int)thisChar - (int)'a';
            
            // 如果该字符只出现一次，打印出来并结束循环
            if (occurrencnes[arrayPos] == 1) {
                System.out.printf("%c is the first non-repeating character\n", thisChar);
                finished = true;
                break;
            }
        }
        
        // 如果所有字符都重复，打印相应的消息
        if (!finished) {
            System.out.println("There are no non-repeating characters");
        }
    }
} 
