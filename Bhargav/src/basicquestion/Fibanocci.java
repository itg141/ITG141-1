package basicquestion;
//Demo of Fibonacci series.
public class Fibanocci {
	void Return(int a,int b) {
		//int sum=0;
		for(int i=1;i<=10;i++) {
			a=a+b;
			System.out.println(a);
			//sum=sum+i;
			b=a+b;
			System.out.println(b);
		}
		
	}
	public static void main(String[] args) {
		
			Fibanocci f= new Fibanocci();
			f.Return(3,10);
		
	}

}
