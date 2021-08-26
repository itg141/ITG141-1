//Print square of each number up to 20
package neww;
class Tes{
	int square(int i) {
		return(i*i);
	}
}

public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tes t= new Tes();
		
		for (int j=1;j<=20;j++) {
			System.out.println(t.square(j));
		}

	}

}
