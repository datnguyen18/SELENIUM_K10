package com.selenium.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("=====MENU======\n");
        sb.append("1. Add number into ArrayList\n");
        sb.append("2. Print numbers\n");
        sb.append("3. Get maximum number\n");
        sb.append("4. Get minimum number\n");
        sb.append("5. Find number index\n");
        sb.append("6. Exit\n");
        System.out.println(sb);
        List<Integer> list = new ArrayList<>();

        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input you option from 1 to 6: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Input the quantity of numbers that you need to input: ");
                    int quantity = scanner.nextInt();
                    while(quantity > 0) {
                        System.out.print("Input number: ");
                        int number = scanner.nextInt();
                        addToList(list, number);
                        quantity--;
                    }
                    break;
                case 2:
                    printNumbers(list);
                    break;
                case 3:
                    printMaxNumber(list);
                    break;
                case 4:
                    printMinNumber(list);
                    break;
                case 5:
                    System.out.print("Input number you need to find: ");
                    int findNumber = scanner.nextInt();
                    findNumberIndex(list, findNumber);
                    break;
                case 6:
                    System.exit(0);
                default: break;
            }
        }
    }

    private static void findNumberIndex(List<Integer> list, int findNumber) {
        List indices = new ArrayList();
        if(list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                if(findNumber == list.get(i))
                    indices.add(i);
            }
            System.out.println(String.format("Index/Indices of number %d is: %s\n", findNumber, indices.toString()));
        } else {
            System.out.println("Please add at least one number to array");
        }
    }

    private static void printMaxNumber(List<Integer> list) {
        try {
            int max = list.get(0);
            for (Integer number: list) {
                if(number > max) {
                    max = number;
                }
            }
            System.out.println(max);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Please add at least one number to array");
        }
    }

    private static void printMinNumber(List<Integer> list) {
        try {
            int min = list.get(0);
            for (Integer number: list) {
                if(number < min) {
                    min = number;
                }
            }
            System.out.println(min);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Please add at least one number to array");
        }
    }

    private static void printNumbers(List<Integer> list) {
        System.out.print(list.toString() + "\n");
    }

    private static void addToList(List<Integer> list, int number) {
        list.add(number);
    }
}
