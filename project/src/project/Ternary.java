package project;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		a=sc.nextInt();
		b=sc.nextInt();
		
		c=a>b ? a:b;
		System.out.println(c);
			

	}

}
