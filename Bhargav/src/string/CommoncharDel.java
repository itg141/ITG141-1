package string;
//Compare two strings and remove the common character
//import java.util.Scanner;
public class CommoncharDel {
	public static void main(String[] args) {
		/*Scanner sc= new Scanner(System.in);
		String s1= sc.nextLine();
		System.out.print("Enter the first String :");
		String s2= sc.nextLine();
		System.out.print("Enter the second String :");*/
		StringBuffer s1= new StringBuffer("Miracle City"); /// the string you want to delete in 
		StringBuffer s2= new StringBuffer("Vizag City");  // the string you want to compare
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					
					s1.deleteCharAt(i);
				}
			}
		}
		System.out.println(s1);
		System.out.println(s2);
	}

}
