import java.util.*;
class Sample
{
  public static void main(String[] args)
  {

    int n, firstTerm = 0, secondTerm = 1;
    
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
    for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm+" ");

      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}