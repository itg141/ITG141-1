import java.util.Scanner;
public class sumof2n {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Enter n value:");
		n=in.nextInt();
		float s=0;
		for(int i=1;i<=n;i++)
		{
			s=s+((float)1/(float)Math.pow(2,i));
		}
		System.out.println("result:"+s);
	}

}




