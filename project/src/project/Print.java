package project;

public class Print {
	static int facorial(int n) {
		int res=1;
		for(int i=2;i<n;i++)
			res*=i;
		return res;
		
	}
	static double sum(int n) {
		double sum=0;
		for(int i=1;i<=n;i++)
			sum+=1.0/facorial(i);
		return sum;
	}
	public static void main(String[] args) {
		int n=5;
		System.out.println(sum(n));
	}

}
