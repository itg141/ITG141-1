/*Program to print string  
 * a. in alphabetical order  
 * b. in reverse alphabetical order*/
package string;
import java.util.*;
public class P7 {
public static void main(String args[]) {
String str;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string");
str=sc.nextLine();
char ch[]=str.toCharArray();
Arrays.sort(ch);
System.out.println(new String(ch));
}
}