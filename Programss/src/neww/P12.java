//Simple Menu Driven Calculator
package neww;
import java.util.*;
class Calc{
	int add(int a, int b) {
		return(a+b);
	}
	int sub(int a, int b) {
		return(a-b);
	}
	int mul(int a, int b) {
		return(a*b);
	}
	float div(int a, int b) {
		return(a/b);
	}
}
public class P12 {

	public static void main(String[] args) {
		System.out.println("Enter 1 to perform addition");
		System.out.println("Enter 2 to perform subtraction");
		System.out.println("Enter 3 to perform multiplication");
		System.out.println("Enter 4 to perform division");
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter a number:");  
		int i= sc.nextInt();
		System.out.println("Enter first number:");  
		int p= sc.nextInt();
		System.out.println("Enter second number:");  
		int q= sc.nextInt();
		Calc c= new Calc();
		switch (i) {
		case 1:
			System.out.println(c.add(p, q));
			break;
		case 2:
			System.out.println(c.sub(p, q));
			break;
		case 3:
			System.out.println(c.mul(p, q));
			break;
		case 4:
			System.out.println(c.div(p, q));
			break;
		default:
			System.out.println("Enter a valid number");
		}

		

	}

}
