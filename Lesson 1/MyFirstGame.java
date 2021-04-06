import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        int randomNumber = getRandomNumber();
        int playerNumber;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            playerNumber = scanner.nextInt();
            if (playerNumber == randomNumber) {
                System.out.println("Поздравляю, число угадано!");
                break;
            }
            else if (playerNumber < randomNumber)
                System.out.println("Данное число меньше того, что загадал компьютер");
            else
                System.out.println("Данное число больше того, что загадал компьютер");
        }     
    }

    private static int getRandomNumber() {
        return 7;
    }
}