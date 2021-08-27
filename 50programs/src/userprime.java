import java.util.Scanner;
public class userprime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number:");
		int n=in.nextInt();
		int count=0;
		 for(int i=1;i<=n;i++)
		 {
				 if(n%i==0)
				 {
					 count++;
				 }
		 }
			 if(count==2)
			 {
				 System.out.println("is a prime");
			 }
			 else 
			 {
				 System.out.println("not a prime");
			 }
		 
	}

}
