package string;
/// program to eliminate
public class SpecialCharElim {

	public static void main(String[] args) {
		String s="#all is well#";
		int i;
		for(i=0;i<s.length();i++) {
			if (s.charAt(i) < 'A' || s.charAt(i) > 'Z' && s.charAt(i) < 'a' || s.charAt(i) > 'z')
			{
			s = s.substring(0, i) + s.substring(i + 1);
			i--;
			}
			}
			System.out.println(s);
			/*if (s.charAt(i) < 'A' || s.charAt(i) > 'Z') {
				s = s.substring(0, i) + s.substring(i + 1);
				i--;
			}
				
		else if(s.charAt(i) < 'a' || s.charAt(i) > 'z') {
				s = s.substring(0, i) + s.substring(i + 1);
				i--;
			}
	}
		System.out.println(s);*/
		}

}

