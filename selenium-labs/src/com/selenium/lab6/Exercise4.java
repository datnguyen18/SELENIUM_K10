package com.selenium.lab6;

import java.util.Scanner;

public class Exercise4 {
    /*
    * https://google.com
    *
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your URL: ");
        String url = sc.nextLine();
        String schema = url.substring(0, url.indexOf(":"));
        String topLevelDomain = url.split("\\.")[1];
        String subDomain = url.replace("." + topLevelDomain, "");
        subDomain = subDomain.replace(schema+ "://", "");
        System.out.println("Your url is: " + schema);
        System.out.println("Your url domain is: " + subDomain);
        System.out.println("Your URL is: ." + topLevelDomain);
    }
}
