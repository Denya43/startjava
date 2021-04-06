public class ConditionalStatement {	
    public static void main(String[] args) {
        int age = 5;
        char sex = 'm';
        float height = 1.8f;
        char firstLetterOfName = 'I';

    	if (age > 20) {
            System.out.println("The age is higher than 20");
        }

        if (sex == 'm') {
            System.out.println("The gender is male");        
        }   
        if (sex != 'm') {
            System.out.println("The gender is female");        
        }

        if (height < 1.8f) {
            System.out.println("The height is less than 1.8 meter"); 
        } else {
            System.out.println("The height is equalse or higher than 1.8 meter"); 
        }

        if (firstLetterOfName == 'M') {
            System.out.println("The name starts with 'M'");  
        } else if (firstLetterOfName == 'I'){
            System.out.println("The name starts with 'I'"); 
        } else {
            System.out.println("The name doest not start with 'M' or 'I'"); 
        }
    }
}