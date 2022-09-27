package com.selenium.lab6;

import java.util.Scanner;

public class Exercise1 {

    /**
     * LAB 6.1
     * Given input string: "2hrs and 5 minutes"
     * Please calculate how many minutes in total
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your time in text (must include hours or minute or both): ");
        String text = sc.nextLine();

        int minutes = 0;
        String[] words = text.split(" ");
        for(int i= 0; i < words.length; i++) {
            if(words[i].equals("hours")) {
                minutes += Integer.parseInt(words[i-1]) * 60;
            }
            if (words[i].equals("minutes")) {
                minutes += Integer.parseInt(words[i-1]);
            }
        }
        System.out.println(String.format("Total minutes is: %d", minutes));
    }
}
