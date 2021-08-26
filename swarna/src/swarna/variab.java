package swarna;
class Variab
{
	int a=10;
	static String name="swarna";
}
public class variab {
	public static void main(String args[])
	{
		Variab dc=new Variab();
		System.out.println(dc.a+" "+dc.name);
		Variab dc1=new Variab();
		dc1.a=20;
		dc1.name="raj";
		System.out.println(dc.a+" "+dc.name);
		System.out.println(dc1.a+" "+dc1.name);
	}

}
