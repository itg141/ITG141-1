//Print factorial of n.
package neww;
class Started{
int n=1,m;
int stare(int i) {
	if (i==0) {
		n = 1;	
	}
	else {
		for(m=i;m>0;m--) {
			n=m*stare(m-1);
		}
	}
	return n;
}
}

public class P24 {
	public static void main(String[] args) {
	Started p=new Started();
	System.out.println(p.stare(4));
	
	}
}
