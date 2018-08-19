import java.util.*;
class code49
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int k=sc.nextInt();
			int tt=0,mm=0,c=0;
			int a[]=new int[n];
			int m[];
			int tomu[];
			if(n%2==0)
			{
				 m=new int[n/2];
				tomu=new int[n/2];
			}
			else
			{
				 m=new int[n/2+1];
				 tomu=new int[n/2];
			}
			
			int i,z=0,j=0;	
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				
			}
			for(i=0;i<n;i++)
			{
				if(i%2==0)
				{
				m[j]=a[i];
				mm=mm+m[j];
				j++;
				}
				else
				{
					tomu[z]=a[i];
					tt=tt+tomu[z];
					z++;
				}
			}
			
			if(k==0)
			{
				
				if(tt>mm)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
			else
			{
				if(tt>mm)
					System.out.println("YES");
				else
				{
					if(k<=n/2)
						c=0;
					else
						k=n/2;
				   while(k-->0)
				   {
					   int max1=max(m,m.length);
					   int min1=min(tomu,tomu.length);
					    
					   tt=(tt-min1)+max1;
					   mm=(mm-max1)+min1;
					   
					   if(tt>mm)
					   {
						 System.out.println("YES");
						 c++;
						 break;
				       }
				   }
				   if(c==0)
					  System.out.println("NO"); 
				}
			}
		}
	}
	static int max(int a[],int l)
	{
		int i;
		int max=a[0];
		for(i=1;i<l;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		if(i!=l)
		a[i]=0;
		return max;
		
	}
	static int min(int a[],int l)
	{
		int i;
		int min=a[0];
		for(i=1;i<l;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		if(i!=l)
		a[i]=Integer.MAX_VALUE;
		return min;
		
	}
}