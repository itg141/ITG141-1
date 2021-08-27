package basicquestion;

public class Factorial {
	double Return(double a) {
		int num=1;
		for(int i=1;i<=a;i++) {
			num=num*i;		
		}
		System.out.println(num);
		return 0.0;
	}
	public static void main(String[] args) {
		Factorial f= new Factorial();
		f.Return(5);
	}

}
