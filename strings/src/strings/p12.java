package strings;
import java.util.Scanner;
public class p12 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string1:");
		String str1 = in.nextLine();
		System.out.println("Enter string2:");
		String str2 = in.nextLine();
		for(int i=0;i<str1.length();i++)
		{
			for(int j=0;j<str2.length();j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					System.out.println("common characters are:"+str1.charAt(i));
				}
	        }
		}
		
	}

}
