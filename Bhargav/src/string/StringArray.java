package string;
/// Take two string arrays and compare them to print the common words
/*public class StringArray {

	public static void main(String[] args) {
		

	}

}*/
public class StringArray {  
    public static void main(String[] args) {  
          StringBuffer sb = new StringBuffer();  
          //printing default capacity of string buffer  
          System.out.println("default capacity of buffer: " + sb.capacity());   
            
          StringBuffer sb1 = new StringBuffer("hello");  
          System.out.println("string1: " + sb1);  
         
          // returns the current capacity of string buffer 1  
          System.out.println("capacity: " + sb1.capacity());  
          // ensure capacity is less than old capacity  
          sb1.ensureCapacity(23);  
          System.out.println("new capacity: " + sb1.capacity());  
            
          StringBuffer sb2 = new StringBuffer("programming");  
          System.out.println("string2: " + sb2);  
  
          // returns the current capacity of the string buffer 2  
          System.out.println("old capacity: " + sb2.capacity());  
                 
          // returns twice oldcapacity*2+2  
          sb2.ensureCapacity(30);  
          System.out.println("new capacity: "+sb2.capacity());  
    }  
}  

