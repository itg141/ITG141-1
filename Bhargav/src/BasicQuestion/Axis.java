package BasicQuestion;
//Check given co-ordinate lies on origin or x-axis y-axis?
public class Axis {

	public static void main(String[] args) {
		Find1 f=new Find1();
		f.find1(0,0);
    }
}
class Find1{
	int find1(int a, int b) {
		int x=a;
		int y=b;
	if(x==0 && y==0) {
		System.out.println("The Points are on the origin");}
	else {
			System.out.println("The Points are  not on the origin");
		}	
	return 0;
	}
}
		
	
