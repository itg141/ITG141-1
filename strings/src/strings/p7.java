package strings;
import java.util.*;
public class p7 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter a string:");
		String str = in.nextLine();
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		String c = new String(ch);
		System.out.println(c);	
		for(int i=str.length();i>0;i--)
		{
			System.out.print(c.charAt(i-1));
		}
	}
}
