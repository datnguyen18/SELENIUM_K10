package com.selenium.lab9.exercise2;

import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        int rounds = 3;
        while (rounds > 0) {
            Animal dog = new Dog();
            Animal horse = new Horse();
            Animal tiger = new Tiger();
            AnimalController.findTheWinner(Arrays.asList(dog, horse, tiger));
            rounds--;
        }
    }
}
