import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Введите имя второго игрока");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        String isNeedReply;

        do {
            guessNumber.play();
            isNeedReply = "";
            while (!isNeedReply.equals("yes") && !isNeedReply.equals("no")) {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                isNeedReply = scanner.nextLine();
            }
        } while (!isNeedReply.equals("no"));
    }
}