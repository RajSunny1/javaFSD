import java.util.scanner;
class Ifelse{
 public static void main(string[] args){
  scanner in=new scanner(system.in);
   system.out.println("please enter yous age:");
     int age =in.nextInt();
      if(age>=18){
      system.out.println("your are eligible to vote !");
      } 
     if(age>=60){
     system.out.println(" your are senior citizen !");
     }
     else{
     system.out.println(" your are not eligible to vote !");
    }
  }
}