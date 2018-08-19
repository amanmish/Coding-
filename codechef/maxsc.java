import java.util.*;
class code35
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n];
			int c[]=new int[n];
			int i;
			for( i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			for(i=0;i<n;i++)
			{
				b[i]=sc.nextInt();
			}
			for(i=0;i<n;i++)
				c[i]=sc.nextInt();
			int max1=0;
			int max2=0;
			int max3=0;
			Arrays.sort(a);
			Arrays.sort(b);
			Arrays.sort(c);
			for(i=n-1;i>=0;i--)
			{
				if(a[i]<b[n-1])
				{
					if(a[i]<c[n-1])
					{
						max1=a[i];
						break;
					}
				}
		    }	
			for(i=n-1;i>=0;i--)
			{
				if(b[i]<c[n-1] && b[i]>max1)
				{
					max2=b[i];
					break;
				}
		    }
			if(max1==0 || max2==0)
				System.out.println(-1);
			else
				System.out.println(max1+max2+c[n-1]);
		}
	}
}