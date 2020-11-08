package com.company;

import java.util.Arrays;

public class Hand {

    private Dice[] dices;
    private int[] holdArray;


    public Hand() {
        this.dices = new Dice[] {new Dice(), new Dice(), new Dice(), new Dice(), new Dice()};
    }

    public Dice GetDice(int i){
        return this.dices[i];
    }

    @Override
    public String toString() {
        return "Dina tärningar är " + Arrays.toString(dices);
    }
}


