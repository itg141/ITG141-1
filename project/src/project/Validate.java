package project;

import java.util.Scanner;

public class Validate {
	public static void main(String[] args) {
		int n,range=1,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("the range:");
		n=s.nextInt();
		while((range>9)||(range<1)&&(count<2)) {
			System.out.println("the range is reached");
			if(count==2)
				System.out.println("particular level");
			count++;
			
				
			
		}
	}
}
		
	
	


