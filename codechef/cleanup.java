import java.util.Scanner;
import java.io.*;
class codechef
{
	public static void main(String ar[])throws IOException
	{
		try
		{
		int t;
		int n,m,i,count=0;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t>0)
		{
			n=sc.nextInt();
			m=sc.nextInt();
			int b[]=new int[n];
			int a[]=new int[m];
			
			for(i=0;i<m;i++)
				a[i]=sc.nextInt();
			for(i=0;i<m;i++)
			{
				b[a[i]-1]=1;
			}
			int c[]=new int[n-m];
			int j=0;
			for(i=0;i<n;i++)
			{
				if(b[i]==0)
				{
					c[j]=i+1;
					j++;
				    count++;
				}
			}
			for(i=0;i<count;i=i+2)
			{
				System.out.print(c[i]+" ");
			}
			System.out.println();
			for(i=1;i<count;i=i+2)
				System.out.print(c[i]+" ");
			System.out.println();
			t--;
		}
		}
		catch(Exception e)
		{
		return;
		}
	}
}
			
					