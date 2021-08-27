import java.util.Scanner;
public class table 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number to print its table:");
		int a=in.nextInt();
		for(int i=1;i<=12;i++)
		{
			System.out.println(a+"*"+i+":"+(a*i));
		}
	}
 
}
