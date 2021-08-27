import java.util.Scanner;
public class uservalidate {

	public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
       System.out.println("enter a number:");
       int a=in.nextInt();
       if(a>=0 && a<11)
       {
    	   System.out.println("valid number");
       }
       else
       {
    	   System.out.println("not a valid number");
       }
	}

}
