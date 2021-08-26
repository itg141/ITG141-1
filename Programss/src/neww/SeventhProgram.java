//Check given co-ordinate lies on origin or x-axis y-axis?
package neww;
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
public class SeventhProgram {

	public static void main(String[] args) {
		
		Check c=new Check();
		c.test(6,0);

	}

}
