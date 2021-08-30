package vk;

    import java.util.*;  
    public class stringreverse  
    {  
    public static void main(String[] arg)  
    {  
    stringreverse rs=new stringreverse();  
    Scanner sc=new Scanner(System.in);  
    System.out.print("Enter a string: ");  
    String  str=sc.nextLine();    
    System.out.println("Reverse of a String  is : "+rs.reversestr(str));          //called method  
    }  
    //reverse string method  
    static String reversestr(String s)  
    {  
    String r="";  
    for(int i=s.length();i>0;--i)        //execute until condition i>0 becomes false  
    {  
    r=r+(s.charAt(i-1));   
    }  
    return r;  
    }  
    }   