//Demo of Fibonacci series.
package neww;

public class P31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k= 5;
		int i1=0;
		int i2=i1+1,i3;		
		for(int i=0;i<=k;i++) {
			i3=i1+i2;
			System.out.println(i3);
			i1=i2;
			i2=i3;
		}
	}

}
