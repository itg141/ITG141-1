package vk;

import java.util.Scanner;

public class upperlower {

	public static void main(String[] args) {
		
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		ch = sc.next().charAt(0);
		if(ch >= 65 && ch <= 90) {
			System.out.println("upper case letter");
			}
		else if(ch >= 97 && ch <= 122) {
			System.out.println("Lower case letter");
			}
		else if(ch >= 48 && ch <= 57) {
			System.out.println("It is a number");
		}
		else {
			System.out.println("It is a symbol");			}
		}
}
