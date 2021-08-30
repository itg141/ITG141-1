package vk;
import java.util.Scanner;
public class string10 {
public static void main(String args[]) {
String s;
int v=0,c=0,w=0;
try (Scanner sc = new Scanner(System.in)) {
	System.out.println("Enter the string");
	s=sc.nextLine();
}
for(int i=0;i<s.length();i++) {
if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'|| s.charAt(i)=='u') 
v++;
else if(Character.isWhitespace(s.charAt(i))) 
w++;
else 
c++;
}
System.out.println("the no of vowels are"+v);
System.out.println("the no of white spaces are"+w);
}}