package project;

import java.util.Scanner;

public class Biggest {

	public static void main(String[] args) {
		int a,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b )
			System.out.println(a+"biggest number" + b);
		else if(a<b)
			System.out.println(a + "lowest number" + b);
		else if(a==b)
			System.out.println("both are equal");
		else
			System.out.println("not equal");

	}

}
