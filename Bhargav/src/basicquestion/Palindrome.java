package basicquestion;
//Check whether the number is Palindrome or not. 
public class Palindrome {
 void Return(int a) {
	 int sum=0,r;
	 int temp=a;
	 while(a>0)
	    {
		 r=a%10;
		 sum=(sum*10)+r;
		 a=a/10;
	   }
	 if(temp==sum)
		 System.out.println("The number is a Palindrome ");
	 else
		 System.out.println("The number is a not a Palindrome ");
 }
	public static void main(String[] args) {
		Palindrome p= new Palindrome();
		p.Return(121);
		
	}

}
