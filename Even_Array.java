import java.util.*;
class main
{
    public static void main(String args[])
    {
        int n,k,l=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        //k=sc.nextInt();
        int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
           if(a[i]%2==0)
           {
               l++;
           }
       }
      if(l==n)
      {
           System.out.print("True");
      }
      else
      {
           System.out.print("False");
      }
       
       
       // System.out.format("%.2f",a);
    }
}