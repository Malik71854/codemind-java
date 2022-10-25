import java.util.*;
class Main
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        int n,m,k,max=0;
        n=sc.nextInt();
        m=sc.nextInt();
        k=sc.nextInt();
        int c=0;
       for(int i=n;i<=m;i++)
       {
           if(i%k==0)
           {
               c++;
           }
       }
       System.out.print(c);
        
        
       
            
        
    }
}