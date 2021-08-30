package basicquestion;
/// Print Sum of 1/1 + 1/2 + 1/22+ ....... + 1/2n. 
public class Series2 {
	static double Return(int a) {
		double i=0;
		double sum=0;
		for(i=1;i<=a;i++) {
			sum=sum + 1/(i*i);
			}
		System.out.println(sum);
		return sum;	
	 }

	public static void main(String[] args) {
		int a=5;
		Return(a);
	}

}
