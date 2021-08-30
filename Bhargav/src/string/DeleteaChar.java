package string;
import java.util.Scanner;
///program to delete a particular character
public class DeleteaChar {

	public static void main(String[] args) {
		Scanner s3 = new Scanner(System.in);
		System.out.printf("enter string:");
		String s = s3.nextLine();
		System.out.printf("enter a character:");
		String s1 = s3.nextLine();
		String S=s.replaceFirst(s1,"");
		System.out.println(s);
		System.out.println(S);
	}

}
