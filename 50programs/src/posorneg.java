import java.util.*;
public class posorneg {
	public static void main(String args[])
	{
		int no;
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number to check wheather it is positive or negtive:");
		no=in.nextInt();
		if(no>0)
		{
			System.out.println("positive number");
		}
		else
		{
			System.out.println("negtive number");
		}
	}

}
