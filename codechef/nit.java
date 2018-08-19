import java.util.*;
class code30
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			long l,r;
			l=sc.nextInt();
			r=sc.nextInt();
			long sum;
			long n=(r-l)/6;
			while((l%6)!=0)
				l++;
			sum=n*(2*l+(n-1)*6)/2;
			System.out.println(sum);
			
		}
		
	}
}
				