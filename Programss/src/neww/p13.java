//Print number of days in a given month.
package neww;
import java.util.*;
public class p13 {
	public static void main(String[] args) {
	System.out.println("Enter a month number");
	Scanner sc= new Scanner(System.in); 
	System.out.println("Enter a number:");  
	int m= sc.nextInt();
		if((m==1)||(m==3)||(m==5)||(m==7)||(m==8)||(m==10)||(m==12)) {
			System.out.println("The given month has 31 days in it");
		}
		else if(((m==4)||(m==6)||(m==9)||(m==11))) {
			System.out.println("The given month has 30 days in it");
		}
		else if (m==2) {
			System.out.println("The given month has 28 or 29 days in it ");
		}
		else {
			System.out.println("Enter a valid number");
		}
	}

}
