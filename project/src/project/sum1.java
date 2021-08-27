package project;

import java.util.Scanner;

public class sum1 {
	public static void main(String[] args) {
		int n,i,sum=0;
		Scanner s=new Scanner(System.in); 
			System.out.println("sum of numbers");
			n=s.nextInt();
			
				for(i=1;i<=n;i++)
					if(i%2==0)
					sum=sum+i;
					System.out.println("the number"+n+"="+sum);
			
		
	}
}


