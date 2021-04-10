package com.startjava.lesson_2_3.game;

import java.util.Arrays;

public class Player {
    
    private String name;
    private int[] arrayOfNumber = new int[10];
    private int counter = -1;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        counter++;
        arrayOfNumber[counter] = number;
    }

    public int getNumber() {
        return arrayOfNumber[counter];
    }

    public int[] getArrayOfNumber() {
        return arrayOfNumber;
    }

    public int getCounter() {
        return counter + 1;
    }

    public void zeroArray() {
        if (counter < 0) {
            counter = 0;
        }
        Arrays.fill(arrayOfNumber, 0, counter, 0);
        counter = -1;
    }
}