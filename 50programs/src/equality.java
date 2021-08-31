import java.util.Scanner;
public class equality {
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in);
			int a,n;
			System.out.println("enter a number:");
			n=in.nextInt();
			a=n%10;
			int t=n/10;
			if (t%10==a)
			{
				t=n/10;
				if(t%10==a)
				{
					System.out.println("All digits are equal");
				}
				else
				{
					System.out.println("All digits are not  equal");			
				}
			
			}
			else
			{
				System.out.println("All digits are not  equal");
			}
     
	}

}
