import java.util.*;
class partition
{
	public static void main(String ar[])
	{
		Scanner  sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			long n,x;
			n=sc.nextInt();
			x=sc.nextInt();
			long i,j;
			long sum=0;
			sum=n*(n+1)/2;
			sum=sum-x;
			System.out.println(sum);
		}
	}
}