package neww;
class Series{
	void s1(int x) {
		double r=0;
		double i=1;
		while(i<=x) {
			r=r+1/i;
			i++;
		}
		System.out.println(r);

	}
}
public class P21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Series s=new Series();
		s.s1(5);
	}

}
