package basicquestion;

//Print series 1 + x/1! + x^2/2! + x^3/3! + .......... + x^n/n!
public class Series3 {
	static double Return1(double a,double b) {
			double i=0,j=0.0;
			double sum=0;
			for(i=1;i<=a;i++) {
				for(j=1;j<=b;j++) {
					Factorial f1=new Factorial();
					sum=sum + Math.pow(b, b)/(f1.Return(i));
				}}
			System.out.println(sum);
			return sum;	
		 }
	 

	public static void main(String[] args) {
		double a=5,b=5;
		Return1(a,b);
		

	}

}
//// Logic understood executon error: retry after 