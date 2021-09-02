package keywords;
/// to demonstrate the meaning of super keyword
// super keyword is used to refer to the immediate parent class( instance variable, method, constructors)
public class Super {

	public static void main(String[] args) {
		Sarvari s= new Sarvari();
		s.turned();
	}
}


class Raja{
	int x=10;
	int y=20;
	void eturn() {
		System.out.println(x+y);
	}
}
class Sarvari extends Raja{
	int x=30;
	int y=40;
	void turned() {
		System.out.println(super.x+y);
	}
}
