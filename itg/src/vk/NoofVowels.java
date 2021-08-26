package vk;

public class NoofVowels {

public static void main(String[] args) {
      int vCount = 0, cCount = 0;    
       
   String str = "This is a really simple sentence"; 
          
   for(int i = 0; i < str.length(); i++) {  
   	
       if(str.charAt(i) == 'V' || str.charAt(i) == 'i' || str.charAt(i) == 'N' || str.charAt(i) == 'A' || str.charAt(i) == 'Y'||str.charAt(i) == 'A' ||str.charAt(i) == 'E' ||str.charAt(i) == 'I' ||str.charAt(i) == 'O' ||str.charAt(i) == 'U') {    
           vCount++;} 
   		  
       else if(str.charAt(i) >= 'r' && str.charAt(i)<='y'||str.charAt(i) >= 'S' && str.charAt(i)<='W') {      
           cCount++;    
       }  
   		
      
  }
   System.out.println("Number of vowels: " + vCount);    
   System.out.println("Number of consonants: " + cCount);  
    
}

}