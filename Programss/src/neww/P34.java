package neww;

public class P34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,m=0,n=78;
		while(n>0) {
			r=n%10;
			if(m<r) {
				m=r;
			}
			n=n/10;
		}
		System.out.println(m);

	}

}
