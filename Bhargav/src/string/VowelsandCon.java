package string;
// program to count number of vowels and consonants
public class VowelsandCon {

	public static void main(String[] args) {
		String str="Bhargav";
		int count=0,ccount=0;
		char ch[]=str.toCharArray();
		for(char c: ch) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u' && c=='A'||c=='E'||c=='I'||c=='O'||c=='U' ) {
				count++;
				}
				else {
				ccount++;
				}
				}
		System.out.println(str);
				System.out.println("No of vowels ="+count);
				System.out.println("No of conosonanats ="+ccount);
		}

	}
