package basicquestion;
//print number of digits in a number 
public class Digits {
	void Return(int num) {
	    int count=0;
	    while(num!=0) {
	    	num=num/10;
	    	count++;   	
		}
	    System.out.println("The number of digits in the number are : "+count);
	}

	public static void main(String[] args) {
		Digits d=new Digits();
         d.Return(100121212);
	}

}
