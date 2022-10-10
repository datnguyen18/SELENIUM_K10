package com.selenium.lab9.exercise1;

import java.util.List;

public class Controller {
    public static double calculateTotalSalary(List<Employee> employees) {
        return employees.stream().mapToDouble(Employee::getSalary).sum();
    }
}
