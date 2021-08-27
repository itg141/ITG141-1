package project;

public class Arthematic2 {
	public static void main(String[] args) {
		Art n=new Art();
		n.add();
		n.sub();
		n.div();
		n.mul();
	}	
	}
	class Art{
		int a=40,b=10;
		public void add() {
			System.out.println(a+b);
		}
	
		public void sub() {
			System.out.println(a-b);
		}
		public void div() {
			System.out.println(a%b);
			
		}	
		public void mul() {
			System.out.println(a*b);
		}
	}
	


