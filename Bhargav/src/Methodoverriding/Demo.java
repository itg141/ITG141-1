package Methodoverriding;

public interface Demo {
void display();
void view();
 }
class Test1 implements Demo{
	 public void display() {
		 
		System.out.println("Abstract method display : From interface demo");
	}
	public void view() {
		System.out.println("Abstract methdo display :"); // these are abstract methods that are overrided rom interface demo
	}
	int add(int a, int b) {
		System.out.println("The sum is :  "+(a+b));    /// this is a concrete method
		return a+b;
	}
}
