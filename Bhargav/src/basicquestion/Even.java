package basicquestion;
/*Print even numbers up to n using 
 * a. For 
 * b. while  
 * c. Do-while */
public class Even {
	public static void main(String[] args) {
		Work w1= new Work();
		w1.work(20,30);
		Work1 w= new Work1();
		w.wooo(40,50);
			}

}
class Work {
	//int count=0;
	 int work(int a,int b){
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				//count++;
				System.out.println(i);
							}
						}
		//System.out.println("The_number_of_even_numbers_are_: "+count);
		return 1;
		}
			}
class Work1{
	int wooo(int a, int b) {
	 int i=a;
		while(i<=b) {
			i++;
			if(i%2==0) {
				System.out.println(i+" Using while loop");
			}
		}
		return 0;
	}
}
 

