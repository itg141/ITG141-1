import java.util.Scanner;
public class duln {
	public static void main(String args[])
	{
		char ch;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a character:");
		ch = in.next().charAt(0);
		
		if(ch >= 'a' && ch <= 'z')
		{
			System.out.println("the input is a lower case");
		}
		else if(ch>='A' && ch <= 'Z')
		{
			System.out.println("the input is a upper case");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("the input is a numaric value");

		}
		else
		{
			System.out.println("the input is aspecial symbol");
		}
		
	}
}
