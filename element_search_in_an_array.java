import java.util.*;
class main
{
    public static void main(String args[])
    {
        int n,k,l=0,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        //k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        k=sc.nextInt();
       for(int i=0;i<n;i++)
    {
     if(((a[i])==k))
     {
        //System.out.print("True");
        l++;
     }
     
    }
    if(l!=0)
    {
        System.out.print("True");
    }
    else
    {
        System.out.print("False");
        
    }
    //cout<<count;
      
       
       
        
    }
}