import java.util.Scanner;
 public class Sunny2{
  public static void main (String[] args){
  int year;
  Scanner scn = new Scanner(System.in);
   year=scn.nextInt();
    if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))  {
      System.out.println(year+":leap year");
      }
       else{
            System.out.println(year+"non-leap year");
	
	 }
	}
   }