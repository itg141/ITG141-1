package string;
//to print the common characters in between two strings
public class Strin1 {
	

	public static void main(String[] args) {
		String s1= new String("Miracle city");
		String s2= "Miracle";
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if( s1.charAt(i)==s2.charAt(j)) 
					System.out.print(s1.charAt(i));
				/*else
					System.out.println("no common characters");*/
			}
		}
		
	}

}


