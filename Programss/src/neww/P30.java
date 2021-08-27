//Check whether the number is Palindrome or not.
package neww;
public class P30{  
    public static void main(String args[]){  
     int r,c=0,temp;    
     int n=454;
     temp=n;    
     while(n>0){    
      r=n%10;   
      c=(c*10)+r;    
      n=n/10;    
     }    
     if(temp==c)    
      System.out.println("palindrome number ");    
     else    
      System.out.println("not palindrome");    
   }  
   }  