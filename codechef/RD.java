import java.util.*;
class code48
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			int i;
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			
			int ans=ResultGCD(a,n);
			if(ans==1)
			{
				System.out.println(0);
			}
			else
				System.out.println(-1);
			
		}
	}
	static int ResultGCD(int a[],int n)
	{
			int r=a[0],i;
			for(i=1;i<n;i++)
			{
				r=GCD(a[i],r);
			}
			return r;
	}
	static int GCD(int x,int y)
	{
		if(x==0)
			return y;
		return GCD(y%x,x);
	}
}