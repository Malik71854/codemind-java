import java.util.*;
class Main
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        int n,max=0;
        n=sc.nextInt();
        
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
                a[i]=sc.nextInt();
            
        }
        for(int i=0;i<n-1;i++)
        {
            
                if(a[i]<=a[i+1])
                {
                    max=1;
                }
            
           
            
        }
        if(max!=0)
        {
            System.out.println("no");
        }
        else
        {
             System.out.println("yes");
            
        }
    }
}