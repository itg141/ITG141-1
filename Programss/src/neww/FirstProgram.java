//Program to take the number at runtime and check whether the given number is positive or negative.
package neww;
import java.util.*;
class Test{
	void check(int a) {
		if (a>0) {
			System.out.println(a+" is a positive number");
		}
		if (a<0) {
			System.out.println(a+" is a negative number");
		}
	}
}
public class FirstProgram {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a number:");  
		int a= sc.nextInt();
		Test t= new Test();
		t.check(a);
	}

}
