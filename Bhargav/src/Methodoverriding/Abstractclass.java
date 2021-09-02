package Methodoverriding;

abstract class Main{
	abstract void fun();
	abstract void display();
	void view() {
		System.out.println("Concrete Method");
	}
}
class Derived extends Main {
void fun(){
	System.out.println("Abstract method 1 ");
}
void display() {
	System.out.println("Abstract method 2 ");
}
}
class Abstractclass {
public static void main(String args[])
{	Main b = new Derived();    
	b.fun();
	b.display();
	//Main m= new Main();     // error showing that it cant instatiate object for main class
	Derived d= new Derived();
	d.display();
	b.view();
}
}
