package basicquestion;
//Check whether the given number is divisible by both 3 and 5. 
public class Divisibleby3and5 {

	public static void main(String[] args) {
		int num=15;
		if(num%3==0 &&num%5==0) {
			System.out.print("The number "+num+" is divisible by 3 and 5 ");
		}
		else {
			System.out.print("The number "+num+" is not divisible by 3 and 5");
		}
	}
}
