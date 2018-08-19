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
	static boolean palindrome(int n)
	{
		int i;
		int c=1;
		int j=n-1;
		int a[]=new int[1000000];
		i=0;
		while(n>0)
		{
			
			a[i]=n%10;
			n=n/10;
			i++;
		}
		for(i=0;i<n/2;i++)
		{
			if(a[i]==a[j])
			{
				c++;
				j--;
			}
			else
				break;
		}
		if(c==n/2-1)
			return true;
		else
			return false;
	}
}

					