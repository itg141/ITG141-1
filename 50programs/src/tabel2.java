import java.util.Scanner;
public class tabel2 {

	public static void main(String[] args) {
		int i=1;
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number to print its table:");
		int a=in.nextInt();
		do
		{
			System.out.println(a+"*"+i+":"+(a*i));
			i++;
		}while(i<=12);
	}

}