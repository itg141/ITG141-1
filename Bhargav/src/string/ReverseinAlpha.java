package string;
// Program to print reverse of the string 
public class ReverseinAlpha {

	public static void main(String[] args) {
		StringBuffer s1= new StringBuffer("Hello World");
		int a=s1.length();
		for(int i=a-1;i>=0;i--) {
			System.out.print(s1.charAt(i));
		}
	}

}
