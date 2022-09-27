package com.selenium.lab6;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your text: ");
        String text = sc.nextLine();
        char[] charArray = text.toCharArray();
        String result = "";
        for (char character : charArray) {
            if(Character.isDigit(character)) {
                result += character;
            }
        }
        System.out.println("Result: " + result);
    }
}
