import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,r,sum=0,temp;
		System.out.println("enter a number:");
		n=in.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
