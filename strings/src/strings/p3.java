package strings;
import java.util.Scanner;
public class p3 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter a string:");
		String str = in.nextLine();
		for(int i=str.length();i>0;i--)
		{
			System.out.print(str.charAt(i-1));
		}
	}

}
