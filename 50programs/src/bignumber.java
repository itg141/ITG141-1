import java.util.Scanner;
public class bignumber {
	public static void main(String args[])
	{
		int x;
		int y;
		Scanner in = new Scanner(System.in);
		System.out.println("enter two numbers to find the biggest number:");
		x=in.nextInt();
		y=in.nextInt();
		if(x>y)
		{
			System.out.println(x+"is big");
		}
		else
		{
			System.out.println(y+"is big");
		}
	}

}
