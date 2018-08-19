import java.util.*;
class code17
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n,p;
			n=sc.nextInt();
			p=sc.nextInt();
			int a[]=new int[n];
			int i;
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			int q,m;
			q=p/2;
			m=p/10;
			int c=0,d=0;
			for(i=0;i<n;i++)
			{
				if(a[i]>=q)
				{
					c++;
				}
				if(a[i]<=m)
				{
					d++;
				}
			}
			if(c==1 && d==2)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}