/*Print even numbers up to n using
a. for
b. while
c. Do-while*/
package neww;
import java.util.*;
public class P18 {
	public static void main(String[] args) {
		System.out.println("Enter a number upto n:");
		Scanner sc= new Scanner(System.in); 
		int n= sc.nextInt();
//using for
	  /*for(int i=1;i<=n;i++) {
				if(i%2==0) {
					System.out.println(i);
				}
			}*/
//using while
	/*int i=1;
		while(i<=n) {
			if(i%2==0) {
				System.out.println(i);
				}
			i++;
			}*/
			

//using do while
		int i;
		do {
			for(i=1;i<=n;i++) {
				if(i%2==0) {
					System.out.println(i);
				}
			}
			}
		while(n==0);
			
			}
}


