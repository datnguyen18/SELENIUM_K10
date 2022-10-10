package com.selenium.lab10;
import com.selenium.lab10.Animal.Builder;
import com.selenium.lab10.Animal;

import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        Animal tiger = new Builder(50, "Tiger").withWings(false).build();
        Animal eagle = new Builder(120, "Eagle").withWings(true).build();
        Animal bird = new Builder(100, "Bird").withWings(true).build();
        Animal horse = new Builder(70, "horse").withWings(false).build();

        Animal winner = Animal.findTheWinner(Arrays.asList(tiger, eagle, bird, horse));
        System.out.println(winner.toString());
    }
}
