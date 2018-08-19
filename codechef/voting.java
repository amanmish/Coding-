import java.util.*;
import java.lang.*;
import java.io.*;
class cook43
{
	public static void main (String[] args)throws IOException
	{
		BufferedReader br= new BufferedReader(new
        InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n=Integer.parseInt(br.readLine());
			int a[]=new int[n];
			int i,j,k=0;
			String ss="";
			for(i=0;i<n;i++)
				a[i]=Integer.parseInt(br.readLine());
			for(i=0;i<n;i++)
			{
				long sum=0;
				int c=0;
				for(j=i+1;j<n;j++)
				{
					if(j==i+1)
					{
						sum=a[j];
						c++;
					}
					else
					{
						if(a[j]>=sum)
						{
							c++;
							sum=sum+a[j];
						}
						else
							sum=sum+a[j];
					}
				}
				for(j=i-1;j>=0;j--)
				{
					if(j==i-1)
					{
						sum=a[j];
						c++;
					}
					else
					{
						if(a[j]>=sum)
						{
							sum=sum+a[j];
							c++;
						}
						else
							sum=sum+a[j];
					}
				}
				String cc=Integer.toString(c);
				ss=ss+cc+" ";
				k++;
			}
				System.out.printf(ss);
			System.out.print("\n");
		}
		
	}
}	