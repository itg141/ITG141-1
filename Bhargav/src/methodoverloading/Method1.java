package methodoverloading;
/// this is an example of methodoverloading where the method has same names but 
// their functionality are different
public class Method1 {

	public static void main(String[] args) {
		Raja r= new Raja();
		r.add(2.0,3.0);
		r.add(1, 2,3);

	}

}

class Raja{
	double add(double a, double b) {
		System.out.println("The sum is : "+(a+b));
		return a+b;
	}
	void add(int a, int b,int c) {
		System.out.println("THE SUM IS : "+(a+b+c));
	}
}
