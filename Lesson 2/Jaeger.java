public class Jaeger  {	

	String modelName = "Bracer Phoenix";
	String mark = "Mark-5";
	String origin = "USA";
	float height = 70.7f;
	float weight = 2.1f;
	int strength = 8;
	int armor = 9;

	boolean drift(){
		return true;
	}

	void move(){
		System.out.println("Moving");
	}

	String scanKaiju(){
		return "scanning";
	}

	void useVortexCannon(){
		System.out.println("activated");
	}

}