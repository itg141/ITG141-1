//Write a program to compute number of hours from seconds. use the word const to define the constant SECONDS_PER_HOUR (hours = seconds / SECONDS_PER_HOUR)
package neww;
import java.util.*;
class Sth{
	final float h = 3600;
	float s;
	float convert(float s) {
		return(s/h);
	}
}
public class P38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sth p =new Sth();
		System.out.println("Enter no. of seconds");
		Scanner sc= new Scanner(System.in); 
		float k= sc.nextInt();
		System.out.println(p.convert(k));
		
	}

}
