package swarna;
class Fruit
{
	void apple()
	{
	int a=100;
	System.out.println(a);
	}
}
	class Pineapple extends Fruit
	{
		void apple()
		{
			String st="pineapple";
			System.out.println(st);
			
		}
		
}
public class mover {

	public static void main(String[] args) {
		Fruit f = new Fruit();
		f.apple();
         Pineapple p =new Pineapple();
         p.apple();
	}

}
