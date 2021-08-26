package vk;

class Tes{
	int square(int i) {
		return(i*i);
	}
}

public class SQuare {

	public static void main(String[] args) {
Tes t= new Tes();
		
		for (int j=1;j<=20;j++) {
			System.out.println(t.square(j));
		}

	}

}