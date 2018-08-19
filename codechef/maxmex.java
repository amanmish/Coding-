import java.util.*;
class code18
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			
			int n=sc.nextInt();
			int k=sc.nextInt();
			int a[]=new int[n];
			int i,j=0,s,f=0,z,w,e=0,v=0,h,ff=0;
			int d[]=new int[1000000];
			int c[]=new int[1000000];
			for(i=0;i<n;i++)
				a[i]=sc.nextInt();
			Arrays.sort(a);
			int p=a[n-1];
			for(i=0;i<p;i++)
				c[i]=i;	
			for(i=0;i<n;i++)
			{
				c[a[i]]=-1;
			}
			for(i=0;i<p;i++)
			{
				if(c[i]!=-1)
				{
					d[j]=c[i];
					j++;
				}
				
				if(c[i]==-1)
					f++;
					
			}
			
			if(k==0)
			{
				if(f==p)
			    {
				System.out.println(a[n-1]+1);
			    }
				else
                    System.out.println(d[0]);					
			}
			else
			{
				if(k<j)
				{
					for(i=0;i<k;i++)
					{
						d[i]=-1;
					}
					for(i=0;i<j;i++)
					{
						if(d[i]!=-1)
						{
							System.out.println(d[i]);
							break;
						}
					}
				}
				else
				{
					for(i=0;i<j;i++)
					{
						d[i]=-1;
						k--;
					}
					z=a[n-1]+k+1;
					System.out.println(z);
				}
			}
			
		}
	}
}