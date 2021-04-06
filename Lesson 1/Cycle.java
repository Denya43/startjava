public class Cycle {
    public static void main(String[] args) {
        System.out.println("Numbers from 0 to 20 ");
        for (int i = 0; i <= 20; i++){
            System.out.println(i);
        }

        System.out.println("Numbers from -6 to 6 with interval 2");
        int counter = 6;
        while (counter >= -6) {
            System.out.println(counter);
            counter -= 2;    
        }

        int counter2 = 10;
        int sumOfOddNumbers = 0;
        do {
            if (counter2 % 2 == 1) {
                sumOfOddNumbers += counter2;
            }
            counter2++;
        } while (counter2 < 20);

        System.out.println("The sum of Odd numbers in range from 10 to 20 = " + sumOfOddNumbers);
    }

}