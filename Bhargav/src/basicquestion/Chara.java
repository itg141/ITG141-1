package basicquestion;
// Print characters from a to z 
public class Chara {
	void Return(int a) {
		for(int i=a;i<=122;i++)
			System.out.println((char)i);
		}
		

	public static void main(String[] args) {
		Chara c= new Chara();
		c.Return(97);
	}

}
