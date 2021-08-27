package BasicQuestion;

public class Series1 {
	 double Return(int a) {
		double i=0;
		double sum=0;
		for(i=1;i<=a;i++) {
			sum=sum + 1/i;
			}
		System.out.println(sum);
		return sum;	
	 }
	public static void main(String[] args) {
	 Series1 ss= new Series1();
	 ss.Return(5);
		/*int a=5;     ////In case if you make the return method static then static variable can be passed
	 System.out.print(Return(a));*/
	}

}
