package com.selenium.lab3;

public class Exercise1 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,6,7,8};
        int countOdd = 0;
        int countEven =0;
        for(int number: array) {
            if(number % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println(String.format("Numbers of odd number: %d", countOdd));
        System.out.println(String.format("Numbers of even number: %d", countEven));
    }
}
