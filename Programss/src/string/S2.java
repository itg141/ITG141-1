package string;
public class S2 {
	public static void main(String[] args) {
		String s1= new String("Miracle city");
		String s2= "Miracle";
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if( s1.charAt(i)==s2.charAt(j)) 
					System.out.print(s1.charAt(i));
			}
		}
		
	}

}

