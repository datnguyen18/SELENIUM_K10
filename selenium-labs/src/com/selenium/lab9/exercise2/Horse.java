package com.selenium.lab9.exercise2;

import java.security.SecureRandom;

public class Horse extends Animal{
    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(75);
    }

    @Override
    public String getName() {
        return "Horse";
    }
}
