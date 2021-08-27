import java.util.Scanner;
public class salary {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name:");
		String ch=in.nextLine();
		System.out.println("enter a number");
		int sal=in.nextInt();
		System.out.println(ch);
		System.out.println("your salary is"+sal);
	}

}
