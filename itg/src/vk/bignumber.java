public class bignumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,m=0,n=5;
		while(n>0) {
			r=n%20;
			if(m<r) {
				m=r;
			}
			n=n/10;
		}
		System.out.println(m);

	}

}