package basicquestion;
import java.util.Scanner;
//Program to print multiplication tables from 1 to 10 upto 12.
public class Multi {

	public static void main(String[] args) {
		 System.out.println("Enter the number :: ");
	      Scanner sc = new Scanner(System.in);
	      int num = sc.nextInt();
		  //num=9;
		do {
			System.out.println("Multiplication Table For "+num+" is : ");
			for(int i=0;i<=12;i++) {
				 int b=num*i;
				System.out.println(num+"*"+i+" = "+b);
		}
		 }
		while(num==0);

	}

}
