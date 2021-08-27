import java.util.Scanner;
public class time {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter time in hours:");
		int t=in.nextInt();
		int sec;
		sec=t*60*60;
		System.out.println("time in seconds:"+sec);
	}

}
