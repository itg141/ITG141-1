//Program to eliminate special characters and numbers other than [a, A---z, Z].  
package string;
import java.util.Scanner;
public class P8 {
public static void main(String args[]) {
String s;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string");
s=sc.nextLine();
for(int i=1;i<s.length();i++) {
if (s.charAt(i) < 'A' || s.charAt(i) > 'Z' && s.charAt(i) < 'a' || s.charAt(i) > 'z')
{
s = s.substring(0, i) + s.substring(i + 1);
i--;
}
}
System.out.println(s);
}
}