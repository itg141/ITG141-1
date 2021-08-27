import java.util.Scanner;
public class facorial {
	public static void main(String args[])
	{ 
		  Scanner in = new Scanner(System.in);
		  System.out.println("enter number to print its facorial:");
		  int i,fact=1;  
		  int number=in.nextInt();
		  for(i=1;i<=number;i++)
		  {    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
	 } 

}
