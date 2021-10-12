import java.util.Scanner;

public class Stringiteration
{
   public static void main(String args[])
   {
      String str;
      
      int sum=0;
      
      Scanner scan = new Scanner(System.in);
     
      System.out.print("Enter String : ");
      str = scan.nextLine();
      System.out.print("Enter the character : ");
      char chr = scan.next().charAt(0);
      scan.close();
     
      for (int i = 0; i < str.length(); i++) {
         if(str.charAt(i) == chr) {
            sum=sum+1;
         }
 
      }
      System.out.print("\n" + sum);
      
   }
}