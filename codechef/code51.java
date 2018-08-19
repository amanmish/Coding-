import java.util.*;
class code51
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int ans,ans1;
			double j=2.0;
			for(int i=0;i<n/2;i++)
			{
				if(Math.pow(2,i)>n)
				{
					ans=Math.pow(2,i-1);
					ans1=Math.pow(2,i);
				}
			}
			int ans2;
			int p=n-ans;
			for(int i=0;i<p;i++)
			{
				if(Math.pow(2,i)>p)
				{
					ans2=Math.pow(2,i-1);
				}
			}
			int ans3=ans2+ans;
			int ans4=ans3>ans1+1?ans1+1:ans3;
			int diff=n-ans4;
			if(diff<0)
				diff=-(diff);
			System.out.println(diff);
		}
	}
}