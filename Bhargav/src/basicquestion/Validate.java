package basicquestion;
/// Validate the users input to be in the range 1-10. 
public class Validate {
	void Return(int num) {
		if(num>0 && num<=10) 
			System.out.println("The number is in the range of 1-10 ");
		else
			System.out.println("The number is a not there ");
	}

	public static void main(String[] args) {
		Validate r= new Validate();
		r.Return(10);

	}

}
