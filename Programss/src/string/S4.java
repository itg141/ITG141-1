package string;
import java.util.Scanner;
public class S4{
	static String s1="",s2="";
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("enter string:");
		String s = in.nextLine();
		int l=s.length();
		for(int i=0;i<l-1;i++) {
			if(Character.isWhitespace(s.charAt(i))) {
				s1=s.substring(0,i);
				s2=s.substring(i,l);				
			}
		
		}
		StringBuffer sb1=new StringBuffer(s1);
		StringBuffer sb2=new StringBuffer(s2);  
		
		System.out.print(sb1.reverse()+" ");
		System.out.print(sb2.reverse());
	}
}
