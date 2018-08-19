import java.util.*;
import java.lang.*;
class cook46
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int k=sc.nextInt();
			int a[]=new int[n];
			int j,c=0;
			int sum=0;
			for(j=0;j<n;j++)
				a[j]=sc.nextInt();
			for (int i : a)
				sum += i;
			int sum1=0;
			for(j=0;j<n;j++)
			{
				sum1=sum-a[j];
				a[j]=a[j]+k;
				if(a[j]>sum1)
					c++;
			}
			System.out.println(c);
		}
	}
}
				