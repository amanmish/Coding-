import java.util.*;
class cook20
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
			long diff=mul1-sum1;
			//System.out.println(diff);
			if(n<k)
				System.out.println(-1);
			else
            {
                if (s < 7)
                {
                    int f = s * k;
                    if (f % n == 0)
                    {
                        out.printLine(f / n);
                    }
                    else
                    {
                        out.printLine(f / n + 1);
                    }
                }
                else
                {
                    if (6 * (n - k) < k)
                    {
                        out.printLine("-1");
                    }
                    else
                    {
                        int f = s * k;
                        if (f % n == 0)
                        {
                            out.printLine(f / n);
                        }
                        else
                        {
                            out.printLine(f / n + 1);
                        }
					}
				}
 
			}
		}
	}
}