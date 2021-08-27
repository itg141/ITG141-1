package project;

public class Test {
	public static void main(String[] args) {
	    Demo d = new Demo();
	    System.out.println(d.add(10,20));
	    System.out.println(d.display("Hello"));
		

}
}
class Demo{
	public int add(int a,int b) {
		return a+b;
	
	}
	public String display(String str) {
		return str;
	}
	
}


	

