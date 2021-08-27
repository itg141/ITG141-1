package project;

public class New {
	public static void main(String[] args) {
	int count=0;
	count++;
	System.out.println(count);
	Num n=new Num();
	Num2 n1=new Num2();
	n.abc();
	n1.abc();
	}
	}

	class Num{
		public void abc(){
			int num=0;
			num=num+1;
		System.out.println(num);
		}
	}
	
		class Num2{
			 public void abc(){
				int a=50;
				int b=60;
				int c=a+b;
				System.out.println(c);
			}
		}
			
		
		
	

