package strings;
import java.util.Scanner;
public class p10 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=in.nextLine();
		int count=0,flag=0;
		int l=0;
		char ch[]=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			flag=0;
			for(int j=0;j<str.length();j++) 
			{
				if(str.charAt(i)==str.charAt(j)) 
				{
					flag=flag+1;
				}
			}
			int m=1;
			for(int k=0;k<ch.length;k++)
			{
				if(ch[k]==str.charAt(i)) 
				{
					m=0;
				}
			}
			if(m==1)
			{
				ch[l]=str.charAt(i);
				l++;
			}
			if(m==1)
			{
				System.out.println(str.charAt(i)+" : "+flag);
			}
		}
	}
}
