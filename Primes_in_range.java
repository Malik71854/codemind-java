import java.util.*;
class main
{
    static int fun(int n)
    {
      if(n<=1)
      {
          return 0;
      }
      else
      {
          int k=(int)Math.sqrt(n)+1;
          for(int i=2;i<k;i++)
          {
              if(n%i==0)
              {
                  return 0;
              }
              
          }
          return 1;
          
      }
    }
    public static void main(String args[])
    {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int c=0;
        for(int i=n;i<=m;i++)
        {
            if(fun(i)==1)
            {
                c++;
            }
        }
        System.out.print(c);
        
        
        
    }
}