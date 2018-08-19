import java.util.*;
class union
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
			int n=sc.nextInt();
			int k=sc.nextInt();
			int a[][]=new int[n][k+1];
			
			int i,j,m;
			long dis=0;
			for(i=0;i<n;i++)
			{
				int len=sc.nextInt();
				while(len>0)
				{
					len--;
					int temp=sc.nextInt();
					a[i][temp]=1;
				}
			}
			for(i=0;i<n;i++)
			{
				for(j=i+1;j<n;j++)
				{
					long ans=0;
					for(m=1;m<=k;m++)
					{
						if(!(a[i][k]==1 || a[j][k]==1))
						{
							ans=1;
							break;
						}
					}
					if(ans==0)
						dis++;
				}
			}
			System.out.println(dis);
		}
	}
}
			
			