import java.util.*;
public class range1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc= new Scanner(System.in); 
		int k= sc.nextInt();
		if((k>=1)&&(k<=10))		
			System.out.println("The given number is in the range of 1 to 15");
		else
			System.out.println("The given number is not in the range of 1 to 15");
	}

}