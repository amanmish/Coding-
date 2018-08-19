import java.util.*;
import java.lang.*;
import java.io.*;
 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		long tc = sc.nextLong();
		while(tc-->0)
		{
		    long n1= sc.nextLong();
		    long n2 = sc.nextLong();
		    long p=n1*n2;
		    while(n1!=n2)
		    {
		        if(n1>n2)
		        {
		            n1=n1-n2;
		        }
		        else{
		            n2=n2-n1;
		        }
		    }
		    p=p/n1;
		    System.out.println(n1+" "+p);
		}
	}
}
 