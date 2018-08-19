import java.util.*;
class kode1
{
	public static void main(String ar[])
	{
		try{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int l,r;
			l=sc.nextInt();
			r=sc.nextInt();
			int i,j;
			int ans=0;
			for(i=l;i<=r;i++)
			{
				ans=ans^i;
			}
			System.out.println(ans);
		}
		}
		catch(Exception e)
		{}
	}
}