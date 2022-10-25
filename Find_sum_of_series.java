import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        float i,n;
        float s=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
           s=s+1/i;
        }
        System.out.format("%.2f",s);
        
    }
}