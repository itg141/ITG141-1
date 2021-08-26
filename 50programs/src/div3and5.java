import java.util.Scanner;
public class div3and5 
{
	public static void main(String args[])
	{
		int no;
		Scanner in = new Scanner (System.in);
		System.out.println("enter a number:");
		no=in.nextInt();
		if(no%3==0 && no%5==0)
		{
			System.out.println("is divisible by 3 and 5");
		}
		else
		{
			System.out.println(" is not divisible by 3 and 5");
		}
	}

}
