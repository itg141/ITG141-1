import java.util.Scanner;
public class terinary {
	public static void main(String args[])
	{
		int a;
		int b;
		Scanner in=new Scanner(System.in);
		System.out.println("enter two numbers:");
		a=in.nextInt();
		b=in.nextInt();
		int c;
		c=a>b?a:b;
		System.out.println(c+" is bigger");
	}

}
