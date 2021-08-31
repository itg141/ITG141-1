package strings;
public class p11 
{
	static  String change(String str)
	{
		System.out.printf("the string is:");
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int k=i;
			while(i<ch.length && ch[i]!=' ')
			{
				i++;
			}
			char temp = ch[k];
			ch[k]=ch[i-1];
			ch[i-1]=temp;
		}
		return new String(ch);
	}
	public static void main(String args[])
	{
		String str="swarna raj narava";
		System.out.println(change(str));
		
	}

}
