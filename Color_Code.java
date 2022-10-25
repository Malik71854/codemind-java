import java.util.*;
class Main
{
    public static void main(String args[])throws Exception
    {
        //char m;
        Scanner sc=new Scanner(System.in);
      //  m=sc.nextChar();
        char m = sc.next().charAt(0);  
        if(m=='V' || m=='v' )
        System.out.println("Violet");
        else if(m=='I' || m=='i' )
        System.out.println("Indigo");
        else if(m=='B' || m=='b' )
        System.out.println("Blue");
        else if(m=='G'|| m=='g' )
        System.out.println("Green");
        else if(m=='Y' || m=='y' )
        System.out.println("Yellow");
        else if(m=='O' || m=='o' )
        System.out.println("Orange");
        else if(m=='R'|| m=='o' )
        System.out.println("Red");
        else
        System.out.println(-1);
    }
}
