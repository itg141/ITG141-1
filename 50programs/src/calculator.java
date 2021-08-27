import java.util.Scanner;
public class calculator {
	public static void main(String args[])
	{
		int a;
		int b;
		Scanner in = new Scanner(System.in);
		System.out.println("enter two numbers:");
		a=in.nextInt();
		b=in.nextInt();
		System.out.println("choose your option:\n1.Add \n2.Sub \n3.Multi \n4.Div");
		int c=in.nextInt();
		switch(c)
		{
		case 1:
			System.out.println("Add="+(a+b));
			break;
		case 2:
			System.out.println("Sub="+(a-b));
			break;
		case 3:
			System.out.println("Multi="+(a*b));
			break;
		case 4:
			System.out.println("Div="+(a/b));
			break;
		default:
		    System.out.println("entered wrong choise");
		}
		
	}

}
