import java.util.Scanner;
public class neven {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number to print prime numbers:");
		int a=in.nextInt();
		for(int i=2;i<=a;i=i+2)
		{
			System.out.println(i);
		}
	}

}
