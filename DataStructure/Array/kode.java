import java.util.*;
class kode
{
	public static void main(String ar[])
	{
		try{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n,p;
			n=sc.nextInt();
			p=sc.nextInt();
			int a[]=new int[101];
			int i;
			int j=1;
			for(i=0;i<=n/2;i++)
			{
				a[i]=j;
				j=j+2;
			}
			for(i=0;i<n/2;i++)
				System.out.print(a[i]+" ");
			System.out.println(a[p-1]);
		}
		}
		catch(Exception e)
		{}
	}
}
