//Print multiplication table for a given number
package neww;
import java.util.*;
public class p14 {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc= new Scanner(System.in); 
		int m= sc.nextInt();
		int p;
		for (int i=1;i<=10;i++) {
			p=m*i;
			System.out.println(m+"*"+i+"="+p);
		}

	}

}
