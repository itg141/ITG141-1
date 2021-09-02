package string;
// compare two strings without pre-defined functions
import java.util.Scanner;
public class ComparewithoutPredefinedFunctions {

	public static void main(String[] args) {
		//String s1="Hello World";
		//String s2="Hello World";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string : ");
		String s1= sc.nextLine();
		System.out.println("Enter the second string : ");
		String s2= sc.nextLine();
		sc.close();
		int flag=0;
		int a=s1.length();
		int b=s2.length();
		if(a==b) {
		for(int i=0;i<a;i++) {
			//for(int j=0;j<b;j++) {
				if(s1.charAt(i)==s2.charAt(i)) 
				   flag++;
				
				//System.out.print(count);	
				//System.out.print("The strings are equal.......");
			}
		
		}
		if(flag==s1.length())
			System.out.print("The strings are equal.......");
		else
			System.out.print("..............The strings are not equal.");
		
	}

}
