package Methodoverriding;
/// check demo.java,demo1.java and Abstractclass.java because they are interlinked
public class Demo1 extends Derived{

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.display();
		t.add(5,6);
		Derived d= new Derived();
		d.view();

	}

}
