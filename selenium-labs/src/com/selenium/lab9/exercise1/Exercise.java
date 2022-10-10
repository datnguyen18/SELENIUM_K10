package com.selenium.lab9.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new ContractorEmployee(), new FulltimeEmployee(), new FulltimeEmployee());
        double totalSalary = Controller.calculateTotalSalary(employees);
        System.out.println("Total salary is: " + totalSalary);
    }
}
