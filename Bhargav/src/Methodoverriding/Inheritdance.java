package Methodoverriding;

public class Inheritdance {
 public static void main(String args[]) {
	 Dance d= new Dance();
	 d.add(5, 6);
	 Music m= new Music();
	 m.add(2,6);
 }
}
class Music{
	int add(int a, int b) {
		  System.out.println("THE SUM OF TWO NUMBERS USING PARENT CLASS METHOD IS : "+(a+b));
	  return 1;
	}
}
class Dance extends Music{
	int add(int a, int b) {
		System.out.println("The sum of two numbers using child class method is : "+(a+b));
		  return 0;
	}
}
