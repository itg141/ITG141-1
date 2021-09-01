package vk;

import java.util.Scanner;
public class replacefirword {

	public static void main(String[] args) {
				String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		s=sc.nextLine();
		sc.close();
		char ch[]=s.toCharArray();
		for(int i=1;i<s.length();i++) {
			if(Character.isWhitespace(s.charAt(i))) 
				s=s.replace(ch[i+1],ch[i-1]);
			}
		System.out.println(s);
		}
	}