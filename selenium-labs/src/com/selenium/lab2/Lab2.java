package com.selenium.lab2;

import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {
//        exercise1();
        exercise2();
    }

    private static void exercise1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you height in meters: ");
        double height = scanner.nextDouble();

        System.out.print("Enter you weight kilograms: ");
        double weight = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("Your BMI: " + bmi);
        if(bmi <= 18.5) {
            System.out.println("And you're underweight");
        } else if(bmi <= 24.9) {
            System.out.println("And you're normal weight");
        } else if(bmi <= 29.9) {
            System.out.println("And you're overweight");
        } else {
            System.out.println("And you're obesity");
        }
        scanner.close();
    }

    private static void exercise2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String text = number % 2 == 0 ? "even" : "odd";
        System.out.println(String.format("It's an %s number", text));
        scanner.close();
    }
}
