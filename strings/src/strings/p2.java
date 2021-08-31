package strings;
import java.util.Scanner;
public class p2 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter a string:");
		String str = in.nextLine();
		int i,count=1;
		for(i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==(' '))
			{ 
				count++;
			}
		}
		System.out.println("number of words in a string:"+count);
		System.out.println("number of characters:"+str.length());
	}
	

}
