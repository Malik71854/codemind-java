import java.util.Scanner;
class Sample
{
   public static void main(String[] args)
   {
      char ch;
      Scanner scan = new Scanner(System.in);
      ch = scan.next().charAt(0);
      
      if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
         ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
         System.out.println("Vowel");
      else
         System.out.println("Consonant");
   }
}