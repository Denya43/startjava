package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    
    private final String name;
    private int[] enteredNumbers = new int[10];
    private int counter = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        enteredNumbers[counter] = number;
        counter++;
    }

    public int getLastNumber() {
        return enteredNumbers[counter - 1];
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, counter);
    }

    public int getCounter() {
        return counter;
    }

    public void clear() {
            Arrays.fill(enteredNumbers, 0, counter, 0);
            counter = 0;
    }
}