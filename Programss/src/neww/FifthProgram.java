//Check whether the student is passed or failed and if he got passed print which rank obtained.
package neww;

public class FifthProgram {

	public static void main(String[] args) {
		int marks=35;
		if(marks>80) {
			System.out.println("First Class");
		}
		else if(marks>60) {
			System.out.println("Second Class");
		}
		else if(marks>=35) {
			System.out.println("Third Class");
		}
		else {
			System.out.println("Fail");
		}
	}

}
