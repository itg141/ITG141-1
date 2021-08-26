package swarna;
class Stat
{
	static int a=23;
	int b=87;

static 
{
	System.out.println("Static block");
}
}
public class stat
{
	public static void main(String args[]) {
	Stat s = new Stat();
	System.out.println(s.a);
	System.out.println(s.b);
	Stat s1 = new Stat();
	s1.a=36;
	System.out.println(s.a);
	System.out.println(s1.a);
	}
}