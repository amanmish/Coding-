import java.util.*;
class code29
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int n,Q,L,R;
		n=sc.nextInt();
		Q=sc.nextInt();
		L=sc.nextInt();
		R=sc.nextInt();
		int i,j;
		int a[]=new int[n+1];
		while(Q-->0)
		{
			int count=0,c,l,r,m,max=0;
			c=sc.nextInt();
			l=sc.nextInt();
			r=sc.nextInt();
			if(c==1)
			{
				a[l-1]=r;
			}
			else
			{
				if(c==2)
				{
					for(i=l-1;i<r;i++)
					{
						max=a[i];
						if(max>=L && max<=R)
						{
							count++;
							m=i;
							break;
						}
					}
					if(count!=0)
					{
					for(j=i+1;j<r;j++)
					{
						if(a[j]>max)
						{
							if(a[j]>=L && a[j]<=R)
							{
								count++;
								max=a[j];
							}
						}
						else
							count++;
					}
					System.out.println(count);
					}
				}
				
			}
			
		}
	}
}