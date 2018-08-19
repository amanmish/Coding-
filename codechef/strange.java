import java.util.*;
class coode22
{
	public static void main(String ar[])
	{
		try{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n,k;
			n=sc.nextInt();
			k=sc.nextInt();
			int i;
			double sum=0;
			double a;
			for(i=0;i<n;i++)
			{
				a=sc.nextInt();
				sum+=a;
			}
				if(sum%2==0 && k==1)
					System.out.println("odd");
				else
					System.out.println("even");
			
		}
		}
		catch(Exception e)
		{}
	}
}
				