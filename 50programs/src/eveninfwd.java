/*import java.util.Scanner;
public class eveninfwd {
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

}*/

/*import java.util.Scanner;
public class eveninfwd {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number to print prime numbers:");
		int a=in.nextInt();
		int i=2;
		while(i<=a)
		{
			System.out.println(i);
			i=i+2;
		}
	}

}*/

import java.util.Scanner;
public class eveninfwd {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number to print prime numbers:");
		int a=in.nextInt();
		int i=2;
		do{
			System.out.println(i);
			i=i+2;
		}while(i<=a);
	}

}