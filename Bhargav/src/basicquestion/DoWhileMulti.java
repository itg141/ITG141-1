package basicquestion;
//Demo of using Do-while loop to print multiplication table for a given number. 
public class DoWhileMulti {

	public static void main(String[] args) {
		int num=9;
		do {
			System.out.println("Multiplication Table For "+num+" is : ");
			for(int i=0;i<=10;i++) {
				 int b=num*i;
				System.out.println("9 *"+i+" = "+b);
		}
		 }
		while(num==0);
	}

}
