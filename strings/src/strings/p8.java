package strings;
import java.util.Scanner;
public class p8 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter a string:");
		String s=in.nextLine();
		for(int i=1;i<s.length();i++) 
		{
		if (s.charAt(i) <= 'A' || s.charAt(i) >= 'Z' && s.charAt(i) <= 'a' || s.charAt(i) >= 'z')
		{
		s = s.substring(0, i) + s.substring(i + 1);
		i--;
		}
		}
		System.out.println(s);
		
	}

}
