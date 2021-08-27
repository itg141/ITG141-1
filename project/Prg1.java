package java;

import java.util.Scanner;

public class Prg1 {
	public static void main(String[] args) {
		int x;
		Scanner input=new Scanner(System.in);
		x=input.nextInt();
		if(x>0) {
			System.out.println("number is positive");
		}
		else if(x<0) {
			System.out.println("number is negative");
		}
		else {
			System.out.println("number");
		}
	}

}
