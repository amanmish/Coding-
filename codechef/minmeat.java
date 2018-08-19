import java.util.*;
import java.lang.*;
class cook44
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n,h;
			n=sc.nextInt();
			h=sc.nextInt();
			int a[]=new int[n];
			int i,j;
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			if(n==h)
				System.out.println(a[n-1]);
			else
			{
				if(n==1)
					System.out.println(a[0]);
				else
				{
					