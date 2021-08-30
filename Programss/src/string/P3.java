//Program to reverse the string without using predefined function for reverse.
package string;
import java.util.Scanner;
public class P3 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.printf("enter string:");
String s = in.nextLine();
for(int i=s.length();i>0;i--)
{
	System.out.print(s.charAt(i-1));
}
}
}