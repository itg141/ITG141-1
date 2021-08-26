package vk;

import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter a number:");
	int no=in.nextInt();
	if(no>0) {
		System.out.println(no+"is positive");
	}
	else{
		System.out.println(no+"is negative");
	}
	}
}