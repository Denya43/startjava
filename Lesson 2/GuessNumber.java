package src.com.startjava.lesson_2_3.game

import java.util.Scanner;

public class GuessNumber {
    
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int random_number = (int) (Math.random() * 10);
        do {
            System.out.println(player1.getName() + " введите число!");
            player1.setNumber(scanner.nextInt());
            if (compareNumbers(player1, random_number)) {
                break;
            }
            System.out.println(player2.getName() + " введите число!");
            player2.setNumber(scanner.nextInt());
            if (compareNumbers(player2, random_number)) {
                break;
            }
        } while (true);
    }

    private boolean compareNumbers(Player player, int randomNumber) {
        if (player.getNumber() == randomNumber) {
            System.out.println(player.getName() + " поздравляю, число угадано!");
            return true;
        } else if (player.getNumber() < randomNumber) {
            System.out.println(player.getName() + " данное число меньше того, что загадал компьютер");
        } else {
            System.out.println(player.getName() + " данное число больше того, что загадал компьютер");
        }
        return false;
    }
}