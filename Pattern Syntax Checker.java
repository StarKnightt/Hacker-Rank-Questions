import java.util.Scanner;
import java.util.regex.*;
// java 7
public class Solution
{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int Hello = Integer.parseInt(sc.nextLine());
      while(Hello>0){
         String pattern = sc.nextLine();
          try{
              Pattern p = Pattern.compile(pattern);
              System.out.println("Valid");
          }catch(Throwable t){
              System.out.println("Invalid");
          }
          Hello--;
      }
   }
}
// Have a nice day.
