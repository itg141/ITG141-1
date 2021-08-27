package neww;
import java.util.*;
public class P41 { 
public static void main(String...args) { 
Scanner in=new Scanner(System.in); 
System.out.println("Enter a number : "); 
int n=in.nextInt(); 
int c=0;  
int t=n; 
for(int i=0;i<9;i++) { 
	n=t; 
c=0; 
while(n!=0) { 
	if(n%10==i) { 
		c++; 
	} 
	n=n/10; 
	} 
System.out.println("Number of occurences of "+i+" is : "+c); 
} 
 
 
} 
}