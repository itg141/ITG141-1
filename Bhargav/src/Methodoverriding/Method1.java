package Methodoverriding;
import java.util.Scanner;
public class Method1 {
	 void add(int a, int b) {
		 System.out.println("The sum of the two numbers is : "+(a+b));
		 		
	}
	 void sub(int a, int b) {
		 System.out.println(a-b);
	 }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number :");
		int a= sc.nextInt();
		System.out.println("Enter the second number :");
		int b = sc.nextInt();
		sc.close();
		Method1 m= new Method1();
		m.add(a,b);
}
class Method2 extends Method1{
	void add(int a,int b) {
		System.out.println(a+" Method2");
		System.out.println(b+" Method2");
		System.out.println(a+b);
		
	}
}
}