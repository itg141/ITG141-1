package Class;
// the motto is to be able to tell the number of digits in a number added..i.e 1213=4(without using strings

public class Noofdigits {

	public static void main(String[] args) {
	    int count = 0, num = 100;

	    while (num != 0) {
	      // num = num/10
	      num /= 10;
	      ++count;
	    }

	    System.out.println("Number of digits: " + count);
	}

}

