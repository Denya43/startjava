package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    
    private String name;
    private int[] enteredNumbers = new int[10];
    private int counter = -1;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        counter++;
        enteredNumbers[counter] = number;
    }

    public int getNumber() {
        return enteredNumbers[counter];
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, counter + 1);
    }

    public int getCounter() {
        return counter + 1;
    }

    public void clear() {
        if (counter > -1) {
            Arrays.fill(enteredNumbers, 0, counter, 0);
            counter = -1;
        }
    }
}