package com.selenium.lab3;

public class Exercise2 {
    public static void main(String[] args) {
        int[] array = new int[]{3,1,6,8,2,4};
        int max = array[0];
        int min = array[0];
        for (int number : array) {
            if(number > max) {
                max = number;
            }
            if(number < min) {
                min = number;
            }
        }
        System.out.println(String.format("Max number: %d", max));
        System.out.println(String.format("Max number: %d", min));
    }
}
