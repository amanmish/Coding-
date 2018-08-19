import java.util.*;
import java.lang.Math;
class code5
{
	public static void main(String ar[])
	{
		int t;
		Scanner sc=new Scanner(System.in);
		long ans;
		while(sc.hasNextLong())
		{
			long n=sc.nextLong();
			if(n<12)
				System.out.print(n);
			else
			{
				ans=(n/2)+(n/3)+(n/4);
				System.out.print(ans);
			}
			System.out.println();
		}
	}
}