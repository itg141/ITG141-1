//Write a program that determines whether a number supplied by the user is prime or not
package neww;

import java.util.*;
class Prime{
	void isp(float p) {
		float tem=(p/2);
		for(int i =2;i<=tem;i++) {
		if (p%i==0) {
				System.out.println("This is not a prime number");
				break;
			}
			else {
				if(p<=3) {
					System.out.println("This is a prime number");
					break;	
					}
				else {
				System.out.println("This is a prime number");
				break;
			}}
		}
	}
}

public class P39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc= new Scanner(System.in); 
		int k= sc.nextInt();
		Prime l=new Prime();
		l.isp(k);
		
	}

}
