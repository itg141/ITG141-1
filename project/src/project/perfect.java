package project;

import java.util.Scanner;

public class perfect {
	public static void main(String[] args) {
		int n,sum=0,i;
		Scanner s=new Scanner(System.in);
				System.out.println("enter a number:");
		n=s.nextInt();
		for(i=1;i<n;i++)
			if(n%i==0)
				sum=sum+i;
		if(sum==n)
			System.out.println("the perfect number:");
		else 
			System.out.println("not perfect number:");
	}

}
