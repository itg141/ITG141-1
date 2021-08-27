//Program to delete given character from given string.
package string;
import java.util.Scanner;
public class P1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.printf("enter string:");
		String s = in.nextLine();
		System.out.printf("enter a character:");
		String s1 = in.nextLine();
		String S=s.replaceFirst(s1,"");
		System.out.println(s);
		System.out.println(S);
		
	}

}
