import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int n,k,i,a[],c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        for(i=0;i<n;i++)
        {
            if(a[i]%k==0)
            c=c+1;
        }
        System.out.print(c);
    }
}