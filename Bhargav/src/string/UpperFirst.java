package string;
// to make the first letter of every word into upper
import java.util.Scanner;
public class UpperFirst {

	public static void main(String[] args) {
		//String str= " miracle city in bogapuram";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string :");
		String str= sc.nextLine();
		sc.close();
		for(int i=0;i<str.length()-1;i++) {
			if(Character.isWhitespace(str.charAt(i))) {
				System.out.printf("%c", Character.toUpperCase(str.charAt(i+1)));
				//char ch=str.toChar();
				//str.toUppercase((str.charAt(i+1)));
			}
			else
				System.out.printf("%c", str.charAt(i+1));
		}
		//System.out.println(str);

	}

}

