package Class;

public class Test1 {

	public static void main(String[] args) {
		Test2 t=new Test2();
		Test23 t2=new Test23();
		System.out.println(t.add(5, 6));
		System.out.println(t.display("Bhargav"));
		System.out.println(t2.div(12,6));
		System.out.println(t2.multe(5,6));
	}

}
class Test2{
	public int add(int a, int b) {
		return a+b;
	}
	/*public char display(char a) {
		return a;
	}*/
	public String display(String a) {
		return 5+3+"  "+a+"Doddi";
	}
}

