package vk;
import java.util.Scanner;
public class stringrev{
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