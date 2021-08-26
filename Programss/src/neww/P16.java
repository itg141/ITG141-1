//Print “n” Even numbers
package neww;
import java.util.*;
public class P16 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc= new Scanner(System.in); 
		int m= sc.nextInt();
		for(int i=1;i<=m;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
