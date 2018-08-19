import java.util.*;
import java.lang.*;
class cook44
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
			int n,q;
			n=sc.nextInt();
			q=sc.nextInt();
			int a[]=new int[n];
			int i,j,l=0,r=0;
			for(i=0;i<n;i++)
				a[i]=sc.nextInt();
			for(i=0;i<q;i++)
			{
				l=sc.nextInt();
				r=sc.nextInt();
				long max=0,max1=0,x=0;
			for(i=2147400000;i<2147483647;i++)
			{
				max=0;
				for(j=l-1;j<r;j++)
				{
					max=max+(a[j]^i);
				}
				if(max>max1)
				{
					max1=max;
					x=i;
				}
			}
			System.out.println(x);
			}
	}
}