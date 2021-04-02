public class Variable {	
    public static void main(String[] args) {
    	byte numOfCores = 4;
    	short cpuFrequency = 4000;
    	int ramCapacity = 200000;
    	long nunmOfScrns = 2;
    	float scrDiagonal = 27.1f;
    	double internetConnectionSpeed = 1000000.0;
    	char typeOfMotherboard = 'b';
    	boolean isNew = false;


        System.out.println("Computer specs {" + '\n' +
                ", numOfCores = " + numOfCores + '\n' +
                ", cpuFrequency = " + cpuFrequency + '\n' +
                ", ramCapacity = " + ramCapacity + '\n' +
                ", nunmOfScrns = " + nunmOfScrns +  '\n' +
                ", scrDiagonal = " + scrDiagonal +  '\n' +
                ", internetConnectionSpeed = " + internetConnectionSpeed +  '\n' +
                ", typeOfMotherboard = " + typeOfMotherboard + '\n' +
                ", isNew = " + isNew + '\n' +
                "}");
    }
}