import java.util.Scanner;
public class sumofal {
	public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
		System.out.println("enter value of X:");
		int x=in.nextInt();
		int fact=1;
		float s=1;
		for(int i=1;i<=x;i++)
		{
			fact=1;
			for(int j=i;j>1;j--)
			{
				fact=fact*j;
			}
			s=s+((float)Math.pow(x,i)/(float)fact);
		}
		System.out.println("result:\n"+s);
	}
}
