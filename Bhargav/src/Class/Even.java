package Class;
//import java.util.*; 

public class Even {

	public static void main(String[] args) {
		/*Scanner sc= new Scanner(System.in); 
		System.out.print("Enter_the_starting_number--");        /// if you want to take the input from user
		int a= sc.nextInt();  
		System.out.print("Enter_the_number_upto_which--");
		int b= sc.nextInt(); 
		Work w=new Work();
		w.work(a,b);*/
		Work w=new Work();
		w.work(50,55);
			}

}
class Work{
	int count=0;
	 int work(int a,int b){
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				count++;
				System.out.println(i);
							}
						}
		System.out.println("The_number_of_even_numbers_are_: "+count);
		return 1;
		}
			}

