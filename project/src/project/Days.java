package project;

import java.util.Scanner;

public class Days {
	public static void main(String[] args) {
		int m,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the days:");
		m=sc.nextInt();
		y=sc.nextInt();
		if(m==1 || m==3 || m==5 ||m==7 || m==8 || m==10 || m==12)
			System.out.println("number of days 31");
		else if((m == 2) && ((y%400==0) || (y%4==0 && y%100!=0)))
			System.out.println("number of days  29");
		else if(m==2)
			System.out.println("number of days 28");
		else
			System.out.println("number of days 30");

}
}