import java.util.*;
public class throughn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		System.out.println("Enter a number");
		Scanner sc= new Scanner(System.in); 
		int m= sc.nextInt();
		if (m<50) {
			for (int i=1;i<=m;i++) {
				c=c+i;
			}
			System.out.println(c);
				
		}
		else {
			System.out.println("Enter a valid number");
		}
	}

}