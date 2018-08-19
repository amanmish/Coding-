import java.util.*;
class code23
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int l,r;
			l=sc.nextInt();
			r=sc.nextInt();
			int i;
			int sum=0;
			for(i=l;i<=r;i++)
			{
				if(palindrome(i))
					sum=sum+i;
			}
			System.out.println(sum);
		}
	}
	boolean palindrome(int n)
	{
		int i;
		int j=n-1;
		for(i=0;i<n/2;i++)
		{
			if(a[i]==a[j])
			{
				c++;
			}
			else
				break;
		}
		if(c==n)
			return true;
		else
			return false;
	}
}

					