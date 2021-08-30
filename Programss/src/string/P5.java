//Program to implement user-defined function to compare two strings.
package string;
class Check{
	int c=0;
	void same(String s11,String s22) {
		int l1=s11.length(),l2=s22.length();
		if(l1==l2) {
			for(int i=0;i<l1;i++) {
				if(s11.charAt(i)==s22.charAt(i)) 
					c++;
			}
		}
		if(c==l1) 
			System.out.println("The two strings are equal");
		else 
			System.out.println("The two strings are not equal");
		}
		
	}

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello",s2= "Hello";
		Check c=new Check();
		c.same(s1,s2);
}
}
