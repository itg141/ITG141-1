import java.util.*;
class Sth{
	final float h = 3600;
	float s;
	float convert(float s) {
		return(s/h);
	}
}
public class secperhur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sth p =new Sth();
		System.out.println("Enter no. of seconds");
		Scanner sc= new Scanner(System.in); 
		float k= sc.nextInt();
		System.out.println(p.convert(k));
		
	}

}