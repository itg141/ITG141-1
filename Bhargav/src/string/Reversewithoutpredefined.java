package string;
import java.util.Scanner;
public class Reversewithoutpredefined {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("enter string:");
		String s = in.nextLine();
		in.close();
		for(int i=s.length();i>0;i--)
		{
			System.out.print(s.charAt(i-1));
		}

	}

}
