package Enum;

enum Levels{
	LOW,
	MEDIUM,
	HIGH
}
public class Levelsss {
	public static void main(String[] args) {
		Levels l1=Levels.LOW;
		switch(l1){
			case LOW:
				System.out.println("The fan speed is low");
				break;
			case MEDIUM:
				System.out.println("The fan speed is medium");
                break;			
			case HIGH:
				System.out.println("The fan speed is high");
				break;
		}

	}

}
