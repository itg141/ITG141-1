package project;

import java.util.Scanner;

public class Rank {

	public static void main(String[] args) {
	 
			int n;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter score");
			n=sc.nextInt();
			if(n>90) {
				System.out.println("pass");
				System.out.println("1st rank");
			}
			else if(n>80)
			{
			System.out.println("pass");
			System.out.println("2nd rank");
			}
			else if(n>70) {
				System.out.println("pass");
				System.out.println("3nd rank");
			}
			else if(n<60) {
				System.out.println("fail");
				System.out.println("better luck next time");
			}
		
	}

}
