package basicquestion;
////Find big digit in a number 
public class BigDigit {
       
	public static void main(String[] args) {
		int num=2020,rem=0,max=0;
 	   while(num>0) {
 		    rem =num%10;
 		   if(max<rem) {
 		      max=rem;}
 			num=num/10;
 		   }
    System.out.println(" "+max);
	}

}
//// Questionable outputs: Reverify