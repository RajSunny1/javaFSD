import java.util.Scanner;
 public class Prime{
  public static void main(String[]args){
   Scanner in=new Scanner(System.in);
   System.out.println("enter the number");
   int num=in.nextInt();
    switch (num){
    case 1: System.out.println("neither prime number nor composite");break;
    case 2: System.out.println("number is prime number");break;
    case 3: System.out.println("number is composite");break;
    }
   }
 }