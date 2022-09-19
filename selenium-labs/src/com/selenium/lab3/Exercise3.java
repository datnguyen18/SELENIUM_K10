package com.selenium.lab3;

import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        int[] arr = { 4, 54, -23, 5, 57, -68, 222 };
        Arrays.sort(arr);
        System.out.println("The sorted array");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
