package string;
public class S3 {
	public static void main(String[] args) {
		StringBuffer s1= new StringBuffer("Delhi City");
		StringBuffer s2= new StringBuffer("Vizag City");
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					s1.deleteCharAt(i);
				}
			}
		}
		System.out.println(s1);
		System.out.println(s2);
	}

}