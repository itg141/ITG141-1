//Program to print the occurrences of each character in a given string.
package string;

public class P11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="hello world";
		int count=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<=s.length()-1;i++) {
			for(int j=0;j<=s.length()-1;j++) {
				if(ch[i]==ch[j]) {
					count++;
					}
			}
			System.out.println(ch[i]+"repeated"+count+"times");
			count=0;
		}
		
	}

}
