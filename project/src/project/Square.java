package project;

import java.util.Scanner;

public class Square {

	

	public static void main(String[] args) {
		int a,i,b=1;
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number:");
		a=s.nextInt();
		for(i=2;i<=10;i++)
			
		b=a*a;
		System.out.println("the square:"+b);
		

	}

}
