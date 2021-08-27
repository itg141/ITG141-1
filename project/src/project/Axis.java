package project;

import java.util.Scanner;

public class Axis {

	public static void main(String[] args) {
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("the Axis lies on:");
		x=sc.nextInt();
		y=sc.nextInt();
		if(x==0 && y!=0)
			System.out.println("lies on x-axis");
		else if(x!=0 && y==0)
			System.out.println("lies on Y-axis");
		else if(x!=0 && y!=0)
			System.out.println("lies on origin");
		else
			System.out.println("not origin");
	}

}
