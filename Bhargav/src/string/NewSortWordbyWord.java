package string;

import java.util.Scanner;
// this code is limited to reverse only two words entered in a string;
// exception in previous program(SortWordbyWord)
public class NewSortWordbyWord {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("enter string:");
		String s = in.nextLine();
		int l=s.length();
		in.close();
		for(int i=0;i<l-1;i++) {
		if(Character.isWhitespace(s.charAt(i))) {
		String s1=new String(s.substring(0,i));
		String s2=new String(s.substring(i,l));
		StringBuffer sb1=new StringBuffer(s1);
		StringBuffer sb2=new StringBuffer(s2); 
		System.out.print(sb1.reverse()+" ");
		System.out.print(sb2.reverse());
           }
		} 
	}
}
