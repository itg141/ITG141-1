//Program to find length of the string without using predefined function for finding length. 
package string;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		int count=0;
		char ch[]=s.toCharArray();
		for(char c : ch)
		{
		count++;
		}
		System.out.println(count);
	}

}
