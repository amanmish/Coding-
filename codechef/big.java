import java.util.*;
import java.lang.*;
import java.text.DecimalFormat;
class cook41
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			double p,q,d,i,j,r;
			double ans=0,fans=0;
			for(i=0;i<n;i++)
			{
				ans=0;
				p=sc.nextInt();
				r=p;
				q=sc.nextInt();
				d=sc.nextInt();
				ans=(d/100f)*p;
				p=p+ans;
				ans=(d/100f)*p;
				ans=p-ans;
				ans=r-ans;
				ans=ans*q;
				fans=fans+ans;
			}
			System.out.printf("%f\n",fans);
		}
	}
}