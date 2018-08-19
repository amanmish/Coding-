import java.util.*;
class code42
{
	public static void main(String ar[])
	{
		try
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
			int c=sc.nextInt();
			int d=sc.nextInt();
			int s=sc.nextInt();
			int delay,et;
			delay=a[0];
			for(i=1;i<n;i++)
			{
				if(a[i]<=a[i-1])
					delay=delay;
				else
				{
					et=a[i]-a[i-1];
					delay=a[i]+et;
				}
			}
			System.out.println(delay);
		}
		}
		catch(Exception e)
		{}
	}
}
			