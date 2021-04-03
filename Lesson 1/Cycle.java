public class Cycle  {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++){
            System.out.println(i);
        }
        int temp = 6;
        while (temp >= -6){
            System.out.println(temp);
            temp = temp - 2;    
        }
        int temp2 = 10;
        int numOfOddNumbers = 0;
        do{
            if (temp2%2==1) {
                numOfOddNumbers++;
            }
            temp2++;
        } while (temp2 < 20);

        System.out.println("The number of Odd values = " + numOfOddNumbers);
    }
}
