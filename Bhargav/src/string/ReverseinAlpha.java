package string;
// Program to print reverse of the string 
import java.util.Scanner;
public class ReverseinAlpha {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the String to be reversed : ");
		String s1= sc.nextLine();
		sc.close();
		//String s1= new String("Hello World");
		int a=s1.length();
		for(int i=a-1;i>=0;i--) {
			System.out.print(s1.charAt(i));
		}
	}

}
