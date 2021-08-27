//Print square of each number upto 20. 
public class Square {
	void Return(int a) {
		for(int i=1;i<=a;i++) {
			System.out.println("The Square root of the number: "+i+" is : "+i*i);
		}
	}
		public static void main(String[] args) {
				Square s= new Square();
				s.Return(20);
				}
	
}