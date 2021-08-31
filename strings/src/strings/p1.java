package strings;
import java.util.Scanner;
public class p1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a string:");
        String str =in.nextLine();
		System.out.println("enter a character to delete:");
		String str1 = in.nextLine();
        String str2 = str.replace(str1," "); 
        System.out.println(str2);
        
	}

}
