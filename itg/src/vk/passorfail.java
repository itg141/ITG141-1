package vk;
import java.util.Scanner;
public class passorfail {
	public static void main(String args[])
	{
		int marks;
		Scanner in=new Scanner(System.in);
		marks=in.nextInt();
		if(marks>30)
		{
			System.out.println("passed");
			if(marks>80)
			{
				System.out.println("A Grade");
			}
			else if(marks>60)
			{
				System.out.println("B Grade");
			}
			else if(marks>40)
			{
				System.out.println("C Grade");
			}
			else
			{
				System.out.println("D Grade");
			}
		}
		else
		{
			System.out.println("Failed");
		}
}
}
