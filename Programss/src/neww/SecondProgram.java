//Check whether the given number is even or odd.
package neww;
import java.util.Scanner;

public class SecondProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String s = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + s);
	}

}
