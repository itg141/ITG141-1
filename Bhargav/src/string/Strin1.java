package string;
//to print the common characters in between two strings
import java.util.Scanner;
public class Strin1 {
	

	public static void main(String[] args) {
		//String s1= new String("Miracle city");
		//String s2= "Miracle";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string :");
		String s1= sc.nextLine();
		System.out.println("Enter the second string :");
		String s2= sc.nextLine();
		sc.close();
		for(int i=0;i<s1.length()-1;i++) {
			for(int j=0;j<s2.length()-1;j++) {
				if( s1.charAt(i)==s2.charAt(j)) 
					System.out.print(s1.charAt(i));
				/*else
					System.out.print("error");*/
			}
		}
		
	}

}


