package basicquestion;
//Program to whether all digits in a given number are equal or not?
public class EqualNum {

	public static void main(String[] args) {
		int num=197,rem=0,max=0;
	 	   while(num>0) {
	 		    rem =num%10;
	 		   if(max<rem) 
	 		      max=rem;
	 			num=num/10;
	 		   }
	 	  // if(max==)
	    System.out.println(" "+max);
		}
	    //System.out.println("Equal Number");
		}
	


