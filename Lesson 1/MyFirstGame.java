import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MyFirstGame  {
    public static void main(String[] args) {

        int randomValue = getRandomValue();
        int playersValue;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            playersValue = scanner.nextInt();
            if (playersValue == randomValue) {
                System.out.println("Поздравляю, число угадано!");
                break;
            }
            else if (playersValue < randomValue)
                System.out.println("Данное число меньше того, что загадал компьютер");

            else
                System.out.println("Данное число больше того, что загадал компьютер");

        }
        
    }

    private static int getRandomValue() {
        List<Integer> array = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        Collections.shuffle(array);
        return array.get(0);
    }
}
