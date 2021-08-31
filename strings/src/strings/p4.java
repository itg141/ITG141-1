package strings;
import java.util.Scanner;
public class p4 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter a string:");
		String str=in.nextLine();
		char[] str1=str.toCharArray();
		boolean space=true;
		for(int i = 0; i < str1.length; i++)
	    {
		     if(Character.isLetter(str1[i]))
		     {
		       if(space)
		       {
		         str1[i] = Character.toUpperCase(str1[i]);
		         space = false;
		       }
		     }
		     else
		     {
		       space = true;
		     }
	    }
	    str = String.valueOf(str1);
   	    System.out.println(str);
	 }
}
		
	


