import java.util.*;
class Main
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        int n,m,max=0,k;
        int l=0;
        n=sc.nextInt();
        m=sc.nextInt();
        k=sc.nextInt();
        max=(int)Math.pow(n,m);
        l=(int)max%k;
       System.out.print(l);
        
    }
}