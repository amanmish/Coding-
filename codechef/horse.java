import java.util.*;
import java.math.BigInteger;
class code
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t;
		t=sc.nextInt();
		while(t>0)
		{
			int  n=sc.nextInt();
			int i,j;
			long k,m;
			long l=1000000000;
			long a[]=new long[5001];
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			for(i=0;i<n;i++)
			{
				for(j=i+1;j<n;j++)
				{
					if(a[i]>a[j])
					{
						k=a[i]-a[j];
						m=k;
					}
					else
					{
						k=a[j]-a[i];
						m=k;
					}
					if(m<l)
					{
						l=m;
					}
				}
			}
			System.out.print(l);
			System.out.println();
			t--;
		}
	}
}
		