import java.util.*;
public class readcharvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your name");
		try (Scanner sc = new Scanner(System.in)) {
			char m = sc.next().charAt(0);   
			System.out.println("Your First Initial is "+m);
		}
	}
}