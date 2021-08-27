import java.util.Scanner;
public class cordinates {
 public static void main(String args[])
 {
	 Scanner in = new Scanner(System.in);
	 System.out.println("enter values of X and Y values:");
	 int x=in.nextInt();
	 int y=in.nextInt();
	 if (x==0 && y==0)
	 {
		 System.out.println("the cordinates lies in the origin");
	 }
	 else
	 {
		 System.out.println("the cordinates does not lie in the origin");
	 }
 }
}
