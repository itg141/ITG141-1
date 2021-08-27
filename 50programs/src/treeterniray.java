import java.util.Scanner;
public class treeterniray {
	public static void main(String args[])
	{
		int a;
		int b;
		int c;
		Scanner in=new Scanner(System.in);
		System.out.println("enter three numbers:");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		int d;
		d=a>b?a>c?a:c:b>c?b:c;
		System.out.println(d+" is bigger");
	}

}

