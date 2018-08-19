import java.util.*;
class gek
{
	public void median(int n[],int l)
	{
		int ans,i;	
		
		if( l==1 )
		{
			System.out.println(n[0]);
		}
		else
		{
			if(l==2)
				System.out.println((n[0]+n[1])/2);
			else
			{
			Arrays.sort(n,0,l);
			
			if(l%2==0)
			{
				ans=(n[l/2]+n[l/2-1])/2;
				System.out.println(ans);
			}
			else
			{
			ans=n[l/2];
			System.out.println(ans);
			}
			
		}
		}
	}
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		gek g=new gek();
		int n=sc.nextInt();
		int a[]=new int[n+1];
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}

		int b[]=new int[n];
		int j=0,k=0,l=0;
		for(i=0;i<n;i++)
		{
			b[j]=a[i];
			j++;
			g.median(b,j);
		}
	}
}