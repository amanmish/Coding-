import java.util.*;
class code49
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int M=sc.nextInt();
			int N=sc.nextInt();
			int a[]=new int[M];
			int b[]=new int[M];
			int result=0;
			int i,j,k;
			for(i=0;i<M;i++)
			{
				a[i]=sc.nextInt();
			}
			for(i=0;i<M;i++)
				{
				b[i]=sc.nextInt();
			}
			if(N<2)
				N=2;
			
			for(i=0;i<M;i++)
			{
				for(j=0;j<M;j++)
				{	
					int fib[]=new int[N];
				
					fib[0]=a[i];
					fib[1]=b[j];
					for(k=2;k<N;k++)
						fib[k]=fib[k-1]+fib[k-2];
					result=(result+fib[N-1])%1000000007;
				}
			}
			System.out.println(result);
		}
	}
}