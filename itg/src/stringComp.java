public class stringComp comp {

}
import java.util.Scanner;

class stringCom
{
 public static void main(String args[])
 {
 String str1,str2;
 try (Scanner sc = new Scanner(System.in)) {
	System.out.println("Enter the 1st string");
	 str1=sc.nextLine();
	 System.out.println("Enter the 2nd string");
	 str2=sc.nextLine();
}
 if(str1.equals(str2))
     {
         	System.out.println("The two string are EQUAL!!!");
         System.out.println(str1+" = "+str2+"("+(str1.equals(str2))+")");
     }
 
     else
     {
         	System.out.println("The two string are NOT EQUAL!!!");
         System.out.println(str1+" != "+str2+"("+(str1.equals(str2))+")");
     }
 }
}