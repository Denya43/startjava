package com.startjava.lesson_2_3.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        System.out.println("Каждый игрок имеет 10 попыток");
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 10);
        player1.zeroArray();
        player2.zeroArray();
        do {
            if (player1.getCounter() < 10) {
                System.out.println(player1.getName() + " введите число!");
                player1.setNumber(scanner.nextInt());
                if (compareNumbers(player1, randomNumber)) {
                    break;
                }
            } else {
                System.out.println("У " + player1.getName() + " закончились попытки");
            }
            if (player2.getCounter() < 10) {
                System.out.println(player2.getName() + " введите число!");
                player2.setNumber(scanner.nextInt());
                if (compareNumbers(player2, randomNumber)) {
                    break;
                }
            } else {
                System.out.println("У " + player2.getName() + " закончились попытки");
            }
            if (player1.getCounter() == 10 && player2.getCounter() == 10) {
                System.out.println("Игра окончена, игроки не угадали число");
                break;
            }
        } while (true);
        showPlayerStatus(player1);
        showPlayerStatus(player2);
    }

    private void showPlayerStatus(Player player) {
        System.out.println("Игрок " + player.getName() + " ввел за игру следующие значения: "
                + Arrays.toString(Arrays.copyOf(player.getArrayOfNumber(), player.getCounter())));
    }

    private boolean compareNumbers(Player player, int randomNumber) {
        if (player.getNumber() == randomNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + randomNumber + " с "
                    + player.getCounter() + " попытки");
            return true;
        } else if (player.getNumber() < randomNumber) {
            System.out.println(player.getName() + " данное число меньше того, что загадал компьютер");
        } else {
            System.out.println(player.getName() + " данное число больше того, что загадал компьютер");
        }
        return false;
    }
}