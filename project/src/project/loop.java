package project;

import java.util.Scanner;

public class loop {
	public static void main(String[] args) {
	int i=2,n;
	Scanner s=new Scanner(System.in);
	System.out.println("the number:");
	n=s.nextInt();
	
		while(i<n) {
			System.out.println(i+"");
			i=i+2;
		}


}
}