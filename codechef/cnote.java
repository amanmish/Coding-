import java.util.*;
class code10
{
	public static void main(String ar[])
	{
		Scanner sc =new Scanner(System.in);
		int  t=sc.nextInt();
		while(t-->0)
		{
			int x,y,n,k;
			x=sc.nextInt();
			y=sc.nextInt();
			k=sc.nextInt();
			n=sc.nextInt();
			int p[]=new int[n];
			int c[]=new int[n];
			int i,j;
			for(i=0;i<n;i++)
			{
				p[i]=sc.nextInt();
				c[i]=sc.nextInt();
			}
			int d=0;
			int page=x-y;
			for(i=0;i<n;i++)
			{
				if(page<=p[i] && c[i]<=k)
				{
					d++;
					break;
				}
			}
			if(d!=0)
				System.out.println("LuckyChef");
			else
				System.out.println("UnluckyChef");
		}
	}
}
					