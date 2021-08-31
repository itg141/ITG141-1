import java.util.Scanner;
public class occaranceofdigits {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter a number:");
		int no=in.nextInt();
		int count=0;
		int temo=no;
		for(int i=0;i<9;i++)
		{
			no=temo;
			count=0;
			while(no!=0)
			{
				if(no%10==i)
				{
					count++;
				}
				no=no/10;
			}
		}
		System.out.println("no.of occarances of is"+count);
	}

}
