package strings;
import java.util.Scanner;
public class p5
{
	void Comparee()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter a string1:");
		String str1=in.nextLine();
		System.out.println("enter a string2:");
		String str2=in.nextLine();
		int flag=1;
		if(str1.length()==str2.length())
		{
			for(int i=0;i<str1.length();i++)
			{
				if(str1.charAt(i)!=str2.charAt(i))
				{
					flag=0;
				}
	        }
		}
		else
		{
			flag=0;
		}
		if(flag==1)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
	}
	public static void main(String args[])
	{
		p5 st=new p5();
		st.Comparee();
		
	}

}
