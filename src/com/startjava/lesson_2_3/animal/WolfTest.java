package src.com.startjava.lesson_2_3.animal

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setAge(5);
        wolf.setNick("Wolf");
        wolf.setColor("Green");
        wolf.setWeight(40);
        wolf.setHeight(1);
        wolf.setSex("Male");

        System.out.println("wolf characteristics {" + '\n' +
                ", Wolf's age = " + wolf.getAge() + '\n' +
                ", Wolf's name = " + wolf.getNick() + '\n' +
                ", Wolf's color = " + wolf.getColor() + '\n' +
                ", Wolf's weight = " + wolf.getWeight() +  '\n' +
                ", Wolf's height = " + wolf.getHeight() +  '\n' +
                ", Wolf's sex = " + wolf.getSex() +  '\n' +
                "}");
    }
}