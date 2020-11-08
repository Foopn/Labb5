package com.company;

import java.util.Random;

public class Dice {
    private int value;

    public Dice() {
        roll();
    }

    public void roll() {
        Random rand = new Random();
        value = rand.nextInt(6) + 1;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

}

