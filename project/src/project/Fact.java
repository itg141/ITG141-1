package project;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		int n,i,fact=1;
		Scanner  s=new Scanner(System.in);
		System.out.println("the factorial:");
		n=s.nextInt();
		for(i=1;i<=n;i++)
			fact=fact*i;
		System.out.println("facorial" + n + "is:"+fact);

	}

}
