public class StringIndex {
	    public static void main(String args[])
	    {
	        try {
	            String a = "Sagar is a bad boy";
	            char c = a.charAt(24); 
	            System.out.println(c);
	        }
	        catch(StringIndexOutOfBoundsException e) {
	            System.out.println("StringIndexOutOfBoundsException");
	        }
	    }
	}


