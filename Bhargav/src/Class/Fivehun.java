package Class;
//import java.util.*; 


public class Fivehun {
	
	
	public static void main(String[] args) {
		/*Scanner sc= new Scanner(System.in); 
		System.out.print("Enter_the_first_number--");        /// if you want to take the input from the user uncomment them
		int a= sc.nextInt(); 
		System.out.print("Enter_the_second_number--");
		int b= sc.nextInt(); */
		Print p=new Print();
		//p.displa(a,b);
		p.displa(500,5000);

	}

}
class Print{
	 void displa(int a, int b){
	int i=a;
	while(i<=b) {
		System.out.println(i);
		i++;
	
	}
	}
}