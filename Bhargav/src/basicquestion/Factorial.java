package basicquestion;

public class Factorial {
	void Return(int a) {
		int num=1;
		for(int i=1;i<=a;i++) {
			num=num*i;		
		}
		System.out.println(num);
		
	}
	public static void main(String[] args) {
		Factorial f= new Factorial();
		f.Return(5);
	}

}
