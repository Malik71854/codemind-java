import java.util.*;
class main
{
    public static void main(String args[])
    {
        int n,l=0,count=1000000;
        float k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]<count)
            {
                count=a[i];
            }
        }
        
       System.out.print(count); 
    
      
       
       
        
    }
}