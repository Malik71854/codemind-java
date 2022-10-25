import java.util.*;
class Main
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        int n,m,max=0,c;
        n=sc.nextInt();
        m=sc.nextInt();
        max=n+m;
        for(int i=max+1;i<max+100000;i++)
        {
            c=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                System.out.print(i-max);
                break;
            }
            
        }
        
        
    }
}