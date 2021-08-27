//Write a program to read in 10 numbers and compute the average, maximum and minimum values.
package neww;
import java.util.*;
public class P40 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in); 
	System.out.println("Enter 10 numbers : "); 
	int sum=0; 
	int max=0; 
	int min=999; 
	for(int i=0;i<10;i++) { 
	int no=in.nextInt(); 
	sum+=no; 
	if(no>max) { 
	max=no; 
	} 
	if(no<min) { 
	min=no; 
	} 
	} 
	System.out.printf("Sum : %d Min : %d Max : %d",sum,min,max); 
	} 

}

