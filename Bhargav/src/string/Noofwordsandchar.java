package string;
import java.util.Scanner;
// Program to count number of words and characters in a given string
public class Noofwordsandchar {

	public static void main(String[] args) {
		String str;
		int count=0,sp,words,count1=0,vl,count2=0,con, schar,c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		str=sc.nextLine();
		for(int i=0;i<str.length()-1;i++) {
			if(Character.isWhitespace(str.charAt(i))) 
				count++;
		}
		words = count+1;
		System.out.println("no of spaces ="+count);
		System.out.println("no of words ="+words);
		char ch[]=str.toCharArray();
		int m=ch.length;
		for(int i=1;i<=m;i++) {
			c++;
		}
		System.out.println("no of characters="+(c-count));
	}

}
