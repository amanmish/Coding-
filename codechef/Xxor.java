import java.util.*;
class code49
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			long a[]=new long[n];
			int i;
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			long res=a[0];
			for(i=1;i<n;i++)
			{
				res=xor(a[i],res);
			}
			System.out.println(2*res);
		}
	}
	static long xor(long a,long b)
	{
		return a^b;
	}
}
			