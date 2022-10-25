import java.util.*;
class Main
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        int n,max=0;
        n=sc.nextInt();
        while(n!=0)
        {int m;
        m=sc.nextInt();
        
        int c=1;
       for(int i=1;i<=m;i++)
       {
           c=c*i;
       }
       System.out.println(c);
       n--;
        }
        
    }
}