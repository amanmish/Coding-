import java.util.*;
class code41
{
	public static void main(String ar[])
	{
		try
		{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
				int N=sc.nextInt();
				int M=sc.nextInt();
				int X=sc.nextInt();
				int K=sc.nextInt();
				sc.nextLine();
				String S=sc.nextLine();
				int l=S.length();
				char c[]=S.toCharArray();
				int o=0,e=0,i;
				for(i=0;i<l;i++)
				{
					if(c[i]=='E')
						e++;
					else
						o++;
				}
				if(M==0)
					System.out.println("no");
				else
				{
					int p=N/M;
					if(X==0)
						System.out.println("no");
					else
						if(X<p)
							System.out.println("no");
						else
							if(K<N)
								System.out.println("no");
							else
							{
								for(i=1;i<=12;i++)
								{
									if(M>=i)
									{
										if(i%2!=0)
										{
											if(o>=X)
											{
												N=N-X;
												o--;
											}
											else
												N=N-o;
										}
									else
									{
										if(e>=X)
										{
											N=N-X;
											e--;	
										}
										else
											N=N-e;
									}
									}
									if(N<=0)
										break;
								}
				if(N<=0)
					System.out.println("yes");
				else
					System.out.println("no");
				}
				}
		}
		}
		catch(Exception e)
		{}
	}
}
				