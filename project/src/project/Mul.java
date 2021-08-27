package project;

import java.util.Scanner;

public class Mul {
	private static int i;

	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("multiplication number:");
		a=s.nextInt();
		
		for(i=1;i<=10;i++)
			System.out.println(a+"*"+i+"="+a*i);
	}

}
