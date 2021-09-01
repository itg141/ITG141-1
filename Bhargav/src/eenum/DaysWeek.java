package eenum;

import java.util.Scanner;
enum Day{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}
public class DaysWeek {
	Day day;
	public DaysWeek(Day day) {
		this.day=day;
	}
	public void dayIsLike()
	 {
	     switch (day)
	     {
	     case MONDAY:
	         System.out.println("Mondays are bad.");
	         break;
	     case FRIDAY:
	         System.out.println("Fridays are better.");
	         break;
	     case SATURDAY:
	     case SUNDAY:
	         System.out.println("Weekends are best.");
	         break;
	     default:
	         System.out.println("Midweek days are so-so.");
	         break;
	     }
	 }

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Day :");
		String str= sc.nextLine();
		sc.close();
		//String str = "MONDAY";
	     DaysWeek dw = new DaysWeek(Day.valueOf(str));
	     dw.dayIsLike();

	}

}
/*import java.util.Scanner;

//An Enum class
enum Day
{
 SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
 THURSDAY, FRIDAY, SATURDAY;
}

//Driver class that contains an object of "day" and
//main().
public class Test
{
 Day day;

 // Constructor
 public Test(Day day)
 {
     this.day = day;
 }

 // Prints a line about Day using switch
 public void dayIsLike()
 {
     switch (day)
     {
     case MONDAY:
         System.out.println("Mondays are bad.");
         break;
     case FRIDAY:
         System.out.println("Fridays are better.");
         break;
     case SATURDAY:
     case SUNDAY:
         System.out.println("Weekends are best.");
         break;
     default:
         System.out.println("Midweek days are so-so.");
         break;
     }
 }

 // Driver method
 public static void main(String[] args)
 {
     String str = "MONDAY";
     Test t1 = new Test(Day.valueOf(str));
     t1.dayIsLike();
 }
}*/