package com.selenium.lab6;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        String myPassword = "P@ssw0rd123";
        int times = 3;
        boolean isLoggedIn = false;
        while(times > 0) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input your password: ");
            String password = sc.nextLine();
            if(myPassword.equals(password)) {
                System.out.println("You're in");
                isLoggedIn = true;
                break;
            }
            times--;
        }
        if(!isLoggedIn) {
            System.out.println("Let's wait for 10 minutes to login again");
        }
    }
}
