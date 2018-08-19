//Reverse words in a given string
import java.util.*;
class geek22ans
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int a=0;a<t;a++)
        {
            String data=s.next();
            String da[]=data.split("\\.");
            int i,j;
            String full="";
            for(i=da.length-1;i>=0;i--)
            full=full+da[i]+".";
         String ans=full.substring(0,full.length()-1);
         System.out.println(ans);   
        }
    }
}