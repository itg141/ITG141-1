package basicquestion;
//import java.util.*; 
//Print sum of all even numbers b/w 1 to n
public class Sumofeven {

	public static void main(String[] args) {
		/*Scanner sc= new Scanner(System.in); 
		System.out.print("Enter_the_number--");        
		int n= sc.nextInt(); */
		int n=10;
		int sum=0;
		for(int i=0;i<=n;i++) {
			if(i%2==0)
			 sum=sum+i;
			}
		System.out.println(sum);
	}
}
