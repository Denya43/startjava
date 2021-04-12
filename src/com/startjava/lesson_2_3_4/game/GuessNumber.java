package com.startjava.lesson_2_3_4.game;

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
        int randomNumber = (int) (Math.random() * 10);
        player1.clear();
        player2.clear();
        do {
            if (player1.getCounter() < 10) {
                enterNumber(player1);
                if (compareNumbers(player1, randomNumber)) {
                    break;
                }
            } else {
                System.out.println("У " + player1.getName() + " закончились попытки");
            }
            if (player2.getCounter() < 10) {
                enterNumber(player2);
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

    private void enterNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(player.getName() + " введите число!");
        player.setNumber(scanner.nextInt());
    }

    private boolean compareNumbers(Player player, int randomNumber) {
        if (player.getNumber() == randomNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + randomNumber + " с "
                    + player.getCounter() + " попытки");
            return true;
        }
        String playerStatus = player.getNumber() < randomNumber ? "данное число меньше того, что загадал компьютер"
                : "данное число больше того, что загадал компьютер";
        System.out.println(player.getName() + " " + playerStatus);
        return false;
    }

    private void showPlayerStatus(Player player) {
        System.out.print("Игрок " + player.getName() + " ввел за игру следующие значения:");
        for (int i = 0; i < player.getEnteredNumbers().length; i++) {
            System.out.print(" " + player.getEnteredNumbers()[i]);
        }
        System.out.println();
    }
}