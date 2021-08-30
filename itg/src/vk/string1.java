package vk;
import java.util.Scanner;
public class string1 {
	public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
		System.out.printf("enter string:");
		String s = in.nextLine();
		System.out.printf("enter a character:");
		String s1 = in.nextLine();
		String S=s.replaceFirst(s1,"");
		System.out.println(s);
		System.out.println(S);
		
	}

}