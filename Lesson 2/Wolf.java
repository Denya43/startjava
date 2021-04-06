public class Wolf {	
	
	private String sex;
	private String nick;
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

	public void setAge (int age) {
		if (age > 0 & age <= 8) {
			this.age = age;
		} else {
			System.out.println("Некорректный возраст");
		}
	}

	public void setNick (String nick) {
		this.nick = nick;
	}

	public void setColor (String color) {
		this.color = color;
	}

	public void setSex (String sex) {
		this.sex = sex;
	}

	public void setHeight (int height) {
		this.height = height;
	}

	public void setWeight (int weight) {
		this.weight = weight;
	}

	public int getAge () {
		return age;
	}

	public String getNick () {
		return nick;
	}

	public String getColor () {
		return color;
	}

	public String getSex () {
		return sex;
	}

	public int getHeight () {
		return height;
	}

	public int getWeight () {
		return weight;
	}
}