import java.util.Scanner;

public class Perornot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc= new Scanner(System.in); 
		int m= sc.nextInt();
		int c=0;
		for (int i=1;i<m;i++) {
			if(m%i==0) {
				c+=i;
			}}	
				if (c==m) {
					System.out.println("number is perfect number");
				}
				else {
					System.out.println("number is not perfect number");
				}
			}
		}
