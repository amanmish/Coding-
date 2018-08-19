import java.util.*;
class code3
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n,m,x,i,j,count=0;
			int lower,upper;
			n=sc.nextInt();
			m=sc.nextInt();
			x=sc.nextInt();
			int sum=0;
			int a[]=new int[n];
			for(i=0;i<n;i++)
				a[i]=sc.nextInt();
			int k=m*x;
			int b[]=new int[100];
			for(i=0;i<n;i++)
			{
				lower=a[i]-k-1;
				upper=a[i]+k;
				if(lower<0)
					lower=0;
				if(upper>100)
					upper=100;
				for(j=lower;j<upper;j++)
					b[j]=1;
			}
			for(i=0;i<100;i++)
			{
				if(b[i]==0)
					count++;
			}
			System.out.print(count);
			System.out.println();
		}
	}
}
				
			