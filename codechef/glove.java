import java.util.*;
import java.lang.*;
class cook40
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int l[]=new int[n];
			int g[]=new int[n];
			int i,j=n-1;
			for(i=0;i<n;i++)
			{
				l[i]=sc.nextInt();
			}
			for(i=0;i<n;i++)
			{
				g[i]=sc.nextInt();
			}
			int c=0,c1=0;
			for(i=0;i<n;i++)
			{
				if(l[i]<=g[i])
					c++;
				if(l[j]<=g[i] && j>-1)
				{
					c1++;
					j--;
				}
			}
			if(c==n && c1==n)
				System.out.println("both");
			else
			if(c==n)
				System.out.println("front");
			else
			if(c1==n)
				System.out.println("back");
			else
				System.out.println("none");
		}
	}
}
			