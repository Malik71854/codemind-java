import java.util.*;
class Main
{
        
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        int n,l,max=0;
        n=sc.nextInt();
        
        
        int [] a=new int[n];
        //int k=0;
        //int c=0;
        for(int i=0;i<n;i++)
        {
                a[i]=sc.nextInt();
                
         }
         l=sc.nextInt();
         int k,c=0,sum=0;
         for(int i=0;i<n;i++)
         {
             k=0;
             for(int j=2;j<a[i];j++)
             {
                 if(a[i]%j==0)
                 {
                     k++;
                 }
             }
             if(k==0)
             {
                 if(a[i]>=l)
                 {
                     c++;
                 }
             }
         }
         
         
         System.out.print(c);
         
        
    }
}