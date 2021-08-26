package vk;

class Check{
	void test(int x,int y) {
		if((x==0)&&(y==0)) {
			System.out.println("this co-ordinate lies on origin");
		}
		
		else if((x==0)&&(y!=0)) {
			System.out.println("this co-ordinate lies on x-axis");
		}
		else if((x!=0)&&(y==0)) {
			System.out.println("this co-ordinate lies on y-axis");
		}
		else {
			System.out.println("this co-ordinate  does notlies on any axis");
		}
	}
}
public class coordinatelies {

	public static void main(String[] args) {
		
		Check c=new Check();
		c.test(6,0);

	}

}