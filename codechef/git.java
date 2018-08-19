import java.util.*;
class code31
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n,m;
			n=sc.nextInt();
			m=sc.nextInt();
			int i,d1=0,e=0,d2=0,f=0;
			int r=0,g=0,j;
			String s[]=new String[100000000];
			sc.nextLine();
			for(i=0;i<n;i++)
			{
				s[i]=sc.nextLine();
			}
			
			for(i=0;i<n;i++)
			{
				char c[]=s[i].toCharArray();
				if(c[0]=='R')
				{
					for(j=1;j<c.length;j=j+2)
					{
						
						if(c[j]=='R')
						{
							
							g=g+3;
						}
					}
					for(j=0;j<c.length;j=j+2)
					{
						if(c[j]=='G')
						{
							r=r+5;
							
						}
					}
					for(j=0;j<c.length;j=j+2)
					{
						if(c[j]=='R')
							e=e+3;

					}
					for(j=1;j<c.length;j=j+2)
					{
						 if(c[j]=='G')
							f=f+5;
					}
				}
				else
				{
					for(j=1;j<c.length;j=j+2)
					{
						if(c[j]=='G')
						{
							r=r+5;	
							
						}
						
					}
					for(j=0;j<c.length;j=j+2)
					{
						if(c[j]=='R')
						{
							g=g+3;
							
						}
					}
					for(j=0;j<c.length;j+=2)
					{
						if(c[j]=='G')
							f=f+5;
						
					}
					for(j=1;j<c.length;j+=2)
					{
						if(c[j]=='R')
							e=e+3;
					}
				}
				
			}
			int ans1=e+f;
			int ans=r+g;
				
			
			if(ans1<ans)
			System.out.println(ans1);
		    else
			System.out.println(ans);
		}
	}
}
						
			
				