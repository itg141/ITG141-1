package project;

public class Bdigi {

	public static void main(String[] args) {
		int n = 37467,rem=0,max=0;
		for(;n>0;)
		{
			rem=n%10;
			if(max<rem)
				max=rem;
			n=n/10;
			
		}
		System.out.println(rem);

	}

}
