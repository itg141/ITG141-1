package neww;
class Fact{
int m;
double n=0;
double stare(int i) {
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
class Series2{
	void s2(int x) {
		double r=0;
		Started p=new Started();
		int i=1;
		while(i<=x) {
			r=r+Math.pow(x,i)/(p.stare(i));
			i++;
		}
		System.out.println(r);

	}
}
public class P23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Started p=new Started();
		Series2 s3=new Series2();
		s3.s2(5);
	}

}
