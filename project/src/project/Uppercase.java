package project;

import java.util.Scanner;

public class Uppercase {

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("The character is:");
		ch=(char) sc.nextInt();
		if(ch>=65 && ch<=90) 
			System.out.println("Uppercase");
			else if(ch>=97 && ch<=122)
				System.out.println("lowercase");
			else if(ch>=48 && ch<=57)
				System.out.println("digits");
			else
				System.out.println("symbol");
		

	}

}

