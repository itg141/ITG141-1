package Methodoverriding;
// to perform and study methodoverriding (inheritance should happen for overriding)
// usually when an object of child class is used it automatically checks for methods in parent class
//but due to methodoverriding the method i the child is executed overriding that of the parent class
public class Inheritdance {
 public static void main(String args[]) {
	 Dance d= new Dance();
	 d.add(5, 6);
	 d.sub(6,5);
	 Music m= new Music();
	 m.add(2,6);
	 /*Inheritdance b= new Inheritdance();
	 b.add(2,1);*/
 }
}
class Music{
	int x=10;
	int add(int a, int b) {
		  System.out.println("THE SUM OF TWO NUMBERS USING PARENT CLASS METHOD IS : "+(a+b));
	  return 0;
	}
	int sub(int a, int b) {
		  System.out.println("THE difff OF TWO NUMBERS USING PARENT CLASS METHOD IS : "+(a-b));
	  return 0;
	}
}
class Dance extends Music{
	int x=20;
	int y=30;
	int add(int a, int b) {
		System.out.println("The sum of two numbers using child class method is : "+(a+b));
		System.out.println("Super keyword : "+(super.x+y));
		return 0;
	}
	int sub(int a, int b) {
		  System.out.println("THE difff OF TWO NUMBERS IS : "+(a-b));
	  return 0;
}
}
