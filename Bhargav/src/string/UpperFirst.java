package string;
// to make the first letter of every word into upper
public class UpperFirst {

	public static void main(String[] args) {
		String str= "miracle city in bogapuram";
		for(int i=0;i<=str.length();i++) {
			if(Character.isWhitespace(str.charAt(i))) {
				System.out.printf(" %c", Character.toUpperCase(str.charAt(i+1)));
				//char ch=str.toChar();
				//str.toUppercase((str.charAt(i+1)));
			}
			else
				System.out.printf("%c", str.charAt(i+1));
		}
		//System.out.println(str);

	}

}

