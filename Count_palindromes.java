import java.util.*;
class Main
{
    static int fun(int n)
    {
        int m=n;
        int rev=0;
        while(n!=0)
        {
            int p=n%10;
            rev=rev*10+p;
            n=n/10;
        }
        if(rev==m)
        {
            return 1;
        }
        else
        {
            return 0;
        }
        
    }
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        int n,max=0;
        n=sc.nextInt();
        
        int [] a=new int[n];
        int k=0;
        int c=0;
        for(int i=0;i<n;i++)
        {
                a[i]=sc.nextInt();
                k=fun(a[i]);
                if(k==1)
                {
                    c++;
                }
         }
        System.out.println(c);
        
    }
}