package string;
// compare two strings without pre-defined functions
public class ComparewithoutPredefinedFunctions {

	public static void main(String[] args) {
		String s1="Hello World";
		String s2="Hello World";
		int a=s1.length();
		int b=s2.length();
		if(a==b) {
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
				}
				//System.out.print(count);	
				//System.out.print("The strings are equal.......");
			}
		}
		System.out.print("The strings are equal.......");
		}
		else
			System.out.print("..............The strings are not equal.");
		
	}

}
