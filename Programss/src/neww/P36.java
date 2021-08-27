//Write a program to Read a character value for variable name YourFirstInitial using input statement.
//Display the content of YourFirstInitial
package neww;
import java.util.*;
public class P36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your name");
		Scanner sc= new Scanner(System.in); 
		char m = sc.next().charAt(0);   
		System.out.println("Your First Initial is "+m);
	}

}
