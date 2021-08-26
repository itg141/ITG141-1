import java.util.Scanner;
public class evenodd{
	public static void main(String args[])
	{
		int no;
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number to check wheather it is even or odd:");
		no=in.nextInt();
		if(no%2==0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}
	}
}
