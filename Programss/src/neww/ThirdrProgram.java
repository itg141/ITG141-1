//Check whether the year is Leap year or not.
package neww;

public class ThirdrProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y=2004;
		if ((y%4==0)||(y%100!=0)&&(y%400==0)){
			System.out.println(y+" is a leap year");
		}
		else {
			System.out.println(y+" is not a leap year");
		}
			
	}

}
