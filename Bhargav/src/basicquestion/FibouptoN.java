package basicquestion;

public class FibouptoN {
	void Return(int a,int b,int n) {
		//int sum=0;
		if(n%2==0) {
			for(int i=1;i<=n/2;i++) {
				a=a+b;
				System.out.println(a);
				//sum=sum+i;
				b=a+b;
				System.out.println(b);
			}
			
		}
		else {
		for(int i=1;i<=(n/2);i++) {
			a=a+b;
			System.out.println(a);
			b=a+b;
			System.out.println(b);
		}
		}
		
	}
	public static void main(String[] args) {
		FibouptoN f= new FibouptoN();
		f.Return(3,10,5);

	}

}
