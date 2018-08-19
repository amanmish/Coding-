import java.util.*;
class lexi
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			long n=sc.nextInt();
			long c=n+1;
			long i,j;
			for(j=0;j<n;j=j+1)
			{
				for(i=97;i<=97;i++)
				{
					c--;
					if(c==0)
					{
						break;
					}
					char s=(char)i;
					String s1=Character.toString(s);
					System.out.print(s1);
				}
			}
			int f=0;
			if(t<1)
				f++;
			else
			System.out.println();
		}
	}
}