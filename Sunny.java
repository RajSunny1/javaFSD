import java.util.Scanner;
 public class Sunny{
  public static void main (String[] args){
   Scanner in = new Scanner(System.in);
    System.out.println("please enter the day number:");
	 int day = in.nextInt();
	 switch(day){
	 case 0:System.out.println("sunday");break;
	 case 1:System.out.println("monday");break;
	 case 2:System.out.println("tuesday");break;
	 case 3:System.out.println("wednesday");break;
	 case 4:System.out.println("thursday");break;
	 case 5:System.out.println("friday");break;
	 case 6:System.out.println("saturday");break;
	 default:System.out.println("wrong option !");
	 }
	}
   }