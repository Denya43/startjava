package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {

    private final Player player1;
    private final Player player2;
    int randomNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        System.out.println("Каждый игрок имеет 10 попыток");
        randomNumber = (int) (Math.random() * 10);
        player1.clear();
        player2.clear();
        do {
            if (player1.getCounter() == 10 && player2.getCounter() == 10) {
                System.out.println("Игра окончена, игроки не угадали число");
                break;
            }
        } while (!(playerGuessedNumber(player1) || playerGuessedNumber(player2)));
        showEnteredNumbers(player1);
        showEnteredNumbers(player2);
    }

    private boolean playerGuessedNumber(Player player) {
        if (player.getCounter() < 10) {
            enterNumber(player);
            return compareNumbers(player, randomNumber);
        }
        System.out.println("У " + player.getName() + " закончились попытки");
        return false;
    }

    private void enterNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println('\n' + player.getName() + " введите число!");
        player.setNumber(scanner.nextInt());
    }

    private boolean compareNumbers(Player player, int randomNumber) {
        if (player.getLastNumber() == randomNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + randomNumber + " с "
                    + player.getCounter() + " попытки" + '\n');
            return true;
        }
        String playerStatus = player.getLastNumber() < randomNumber ? "меньше"
                : "больше";
        System.out.println(player.getName() + " " + "данное число " + playerStatus + " того, что загадал компьютер");
        return false;
    }

    private void showEnteredNumbers(Player player) {
        System.out.print("Игрок " + player.getName() + " ввел за игру следующие значения:");
        for (int x : player.getEnteredNumbers()) {
            System.out.print(" " + x);
        }
        System.out.println();
    }
}