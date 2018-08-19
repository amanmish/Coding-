import java.util.*;
class kk
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
			int i,ans=0,c=0;
			for(i=0;i<n;i++)
				a[i]=sc.nextInt();
			for(i=0;i<n;i++)
				b[i]=sc.nextInt();
			ans=a[0]-0;
			if(ans>=b[0])
				c++;
			for(i=1;i<n;i++)
			{
				ans=a[i]-a[i-1];
				if(ans>=b[i])
					c++;
			}
			System.out.println(c);
		}
	}
}
			