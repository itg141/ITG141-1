import java.util.Scanner;
public class sumofeven {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int sum=0;
		System.out.println("enter a number:");
		int a=in.nextInt();
		int i;
		for(i=2;i<=a;i=i+2)
		{
			sum=sum+i;
		}
		System.out.println("sum of even numbers is"+sum);
	}

}
