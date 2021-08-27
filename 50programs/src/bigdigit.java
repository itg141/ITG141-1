import java.util.Scanner;
public class bigdigit {
	public static void main(String args[])
	{
	Scanner in = new Scanner(System.in);
	int num,r;
	System.out.println("enter a number:");
	num=in.nextInt();
	int max=0;
	while(num>0)
	{
		r=num%10;
		if(max<r)
		{
			max=r;
		}
		num=num/10;
	}
	System.out.println("the largest digit of the numberis"+max);
	}	
}
