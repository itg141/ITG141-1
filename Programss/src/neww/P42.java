package neww;

public class P42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,n=242;
			r=n%10;
			int t=n/10;
			if (t%10==r) {
				t=n/10;
				if(t%10==r) {
					System.out.println("All digits are equal");
				}
				else {
					System.out.println("All digits are not  equal");
					
				}
		
		}
			else {
				System.out.println("All digits are not  equal");
				}
}
}