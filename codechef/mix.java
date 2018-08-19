import java.util.*;
import java.lang.*;
class cook42
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			int i,j,c=0;
			for(i=0;i<n;i++)
				a[i]=sc.nextInt();
			Arrays.sort(a);
			for(i=0;i<n-1;i++)
			{
				if(a[i]==a[i+1])
					c++;
			}
			System.out.println(c);
		}
	}
}
			
						