package basicquestion;

public class FibouptoN {
	void Return(int a,int b,int n) {
		//int sum=0;
		
			for(int i=1;i<=n/2;i++) {
				a=a+b;
				System.out.println(a);
				//sum=sum+i;
				b=a+b;
				System.out.println(b);
				}	
	}
	public static void main(String[] args) {
		FibouptoN f= new FibouptoN();
		f.Return(3,10,5);

	}

}
///// vague answer is produced, logical error: recheck this later(interesting)