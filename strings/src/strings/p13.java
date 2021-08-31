package strings;
import java.util.Scanner;
public class p13 
{
	public static void main(String[] args) 
	{
        StringBuffer str1= new StringBuffer();
        StringBuffer str2= new StringBuffer();
		Scanner in = new Scanner(System.in);
		System.out.println("enter str1:");
		str1.append(in.nextLine());
		System.out.println("enter str2:");
		str2.append(in.nextLine());
		for(int i=0;i<str1.length();i++) 
		{
			for(int j=0;j<str2.length();j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					str1.deleteCharAt(i);
					str2.deleteCharAt(j);
				}
			}
		}
		System.out.println(str1);
		System.out.println(str2);
	}
}
