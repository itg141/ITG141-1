import java.util.Scanner;
public class numberofdigits 
{
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=in.nextInt();
		int count=0;
		while(n!=0)
		{
			n=n/10;
			++count;
			
		}
		System.out.println("number of digits:"+count);
	}

}
