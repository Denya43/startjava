package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Введите имя второго игрока");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        String needReply;

        do {
            guessNumber.play();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                needReply = scanner.nextLine();
            } while (!needReply.equals("yes") && !needReply.equals("no"));
        } while (!needReply.equals("no"));
    }
}