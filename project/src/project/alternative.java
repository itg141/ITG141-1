package project;

public class alternative {
	public static void main(String[] args) {
		int n = 5556;
		alt a=new alt();
		a.getSum(n);
		
		
		
	}
}
		class alt{
			 int getSum(int n) {
				int sum=0;
		
		
		while(n!=0) {
			sum=sum+n%10;
		n=n/10;
		
			}
	
			return sum;
		}
	
		
		}
