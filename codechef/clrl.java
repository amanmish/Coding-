import java.util.*;
class code26
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int r=sc.nextInt();
			int a[]=new int[n];
			int i,j,d=0;
			for(i=0;i<n;i++)
				a[i]=sc.nextInt();
			int c=a[0];
			int count=0;
			if(n==1 && a[0]==r)
					System.out.println("YES");
			else
			{
			for(i=1;i<n-1;i++)
			{
                   	if(c>r)
					{						
					if(a[i]>r && a[i]<c)
					{
						c=a[i];
						count++;
					}
					else
					{
						if(a[i]<r && a[i]>d)
						{
							d=a[i];
							count++;
						}
					}
					}
				   
				   
			}
			if(count==(n-2))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		}
	}
}
			