public class Wolf {	
	
    private String sex;
    private String nickname;
    private String color;
    private int height;
    private int weight;
    private int age;

    public void walk() {
        System.out.println("Ходить");
    }

    public void sit() {
        System.out.println("Сидеть");
    }

    public void run() {
        System.out.println("Бежать");
    }

    public void howl() {
        System.out.println("Воет");
    }

    public void hunt() {
        System.out.println("Охотится");
    }

    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        if (age > 0 & age <= 8) {
            this.age = age;
        } else {
            System.out.println("Некорректный возраст");
        }
    }
    
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}