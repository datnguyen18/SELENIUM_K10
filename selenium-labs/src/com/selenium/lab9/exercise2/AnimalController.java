package com.selenium.lab9.exercise2;

import java.util.List;

public class AnimalController {
    public static void findTheWinner(List<Animal> animals) {
        String animalName = "";
        int maxSpeed = 0;
        for (Animal animal : animals) {
            if(animal.getSpeed() > maxSpeed) {
                maxSpeed = animal.getSpeed();
                animalName = animal.getName();
            }
        }

        System.out.println("The winner is " + animalName);
    }
}
