package neww;
class Series1{
	void s2(int x) {
		double r=0;
		double i=1;
		while(i<=x) {
			r=r+1/(i*i);
			i++;
		}
		System.out.println(r);

	}
}
public class P22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Series1 s=new Series1();
		s.s2(5);
	}

}
