package vk;

public class string11 {
	public static void main(String[] args) {
		String s ="i am dead";
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