import java.util.*;
public class commonchar {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     String a="";
     String b="";
     String c="";
     System.out.print("Enter a string ");
     a=sc.next();
     System.out.println("Enter Another String");
     b=sc.next();
     
     int d= a.length();
    
     for(int i=0;i<d;i++){
		char ch = a.charAt(i);
    	 if(b.indexOf(ch)!=-1) {
    		c=c+String.valueOf(ch);
    		}
    	}
     System.out.print(" COMMON LETTER'S ARE :"+c);
 }
}
