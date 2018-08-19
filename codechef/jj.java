import java.util.*;
class cook21
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n,k,s;
			n=sc.nextInt();
			k=sc.nextInt();
			s=sc.nextInt();
			long mul1,mul2;
			mul1=6*n;
			mul2=k*s;
			int i;
			long sum=0;
			int c=0;
			long req=mul2;
			long sum1=0,pro=k;
			for(i=2;i<1000000;i++)
			{
				if(pro>=mul1)
				{
					sum1=k*(i-2);
					break;
				}
				else
				{
					pro=k*i;
				}
			}
			//System.out.println(sum1);
			long diff=0;
			//System.out.println(diff);
			if(n<k)
				System.out.println(-1);
			else
			{
				if(k>n/2)
				{
				for(i=1;i<=7;i++)
				{
					if(req<=sum)
					{
						System.out.println(i-1);
						break;
					}
					else
					{
						sum=n*i;
						c++;
					}
					if(c==7)
						System.out.println(-1);
				}
				}			
				else
				{
					for(i=1;i<=1000;i++)
					{
						if(i%7==0)
						{
							if(diff<k)
							{
								System.out.println(-1);
								break;
							}
						}
						if(req<=sum)
						{
							System.out.println(i-1);
							break;
						}
						else
						{
							sum=n*i;
							diff=mul2-sum;
							System.out.println(diff);
						}
					}
				}	
			}
		}
	}
}