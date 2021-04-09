package src.com.startjava.lesson_1.game

import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        int randomNumber = 7;
        int playerNumber;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            playerNumber = scanner.nextInt();
            if (playerNumber == randomNumber) {
                System.out.println("Поздравляю, число угадано!");
                break;
            } else if (playerNumber < randomNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("Данное число больше того, что загадал компьютер");
            }
        }     
    }
}