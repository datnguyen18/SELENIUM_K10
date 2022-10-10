package com.selenium.lab10;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Animal {
    private int speed;
    private String name;
    private boolean isFlyable;

    protected Animal(Builder builder) {
        this.speed = builder.speed;
        this.isFlyable = builder.flyable;
        this.name = builder.name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyable() {
        return isFlyable;
    }

    public static class Builder {
        private int speed;
        private String name;
        private boolean flyable;

        public Builder(int speed, String name) {
            this.speed = speed;
            this.name = name;
        }

        public Builder withWings(boolean hasWing) {
            this.flyable = hasWing;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }
    public static Animal findTheWinner(List<Animal> animals) {
        List<Animal> raceableAnimals = getRaceableAnimals(animals);
        return raceableAnimals.stream().max(Comparator.comparing(Animal::getSpeed)).get();
    }

    private static List<Animal> getRaceableAnimals(List<Animal> animals) {
        List<Animal> raceableAnimals = new ArrayList<>();
        for (Animal animal: animals) {
            if(!animal.isFlyable()) {
                raceableAnimals.add(animal);
            }
        }
        return raceableAnimals;
    }

    @Override
    public String toString() {
        return String.format("The animal is %s and speed is %d", this.name, this.speed);
    }
}
