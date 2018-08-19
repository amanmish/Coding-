import java.util.*;
class code37
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			long a[]=new long[n*n];
			int i,j;
			for(i=0;i<n*n;i++)
				a[i]=sc.nextLong();
			i=0;
			while(i<n*n)
			{
				Arrays.sort(a,i,i+n);
				i=i+n;
			}
			long c=0;
			//for(i=0;i<n*n;i++)
				//System.out.print(a[i]+" ");
			long m,sum=a[n*n-1];
			long max=a[n*n-1];
			for(i=(n-1)*n;i>0;i=i-n)
			{
				c=0;
				for(j=i-1;j>=i-n;j--)
				{
					if(max>a[j])
					{
						sum=sum+a[j];
						max=a[j];
						break;
					}
					c++;
					if(c==n)
					{
						c=-1;
						
					}
				}
				if(c==-1)
					break;
			}
			if(c==-1)
				System.out.println(-1);
			else
			System.out.println(sum);
		}
		
	}
}