package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        
        // 创建一个从键盘读取输入的Scanner对象
        Scanner keyboard = new Scanner(System.in);
        
        // 创建一个栈来存储字符串中的字符
        Stack<Character> charStack = new Stack<Character>();
        
        // 用于存储反转后的字符串
        String reverseStr = "";

        // 提示用户输入一个字符串
        System.out.print("\nEnter a string > ");
        String inputStr = keyboard.nextLine();

        int i = 0;
        // 遍历输入字符串的每个字符
        while (i < inputStr.length()) {
            // 将每个字符压入栈中
            charStack.push(inputStr.charAt(i));
            i++;
        }

        // 打印栈中的内容
        System.out.println("Stack contents: " + charStack);

        // 从栈中逐个取出字符并添加到reverseStr字符串中，这样得到的是原字符串的反转版本
        while (!charStack.empty()) {
           reverseStr += charStack.pop();
        }
        
        // 打印原始字符串及其反转版本
        System.out.printf("%s resersed is %s\n", inputStr, reverseStr);

        // 检查原始字符串与其反转版本是否相同，如果相同则为回文
        if (inputStr.equals(reverseStr))
            System.out.printf("%s is a palindrome!\n", inputStr);
    }
}
