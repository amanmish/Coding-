import java.util.*;
class code27
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n,p,i;
			n=sc.nextInt();
			p=sc.nextInt();
			if(p==1)
				System.out.print("impossible");
			else
			{
				if(n==2)
					System.out.print("impossible");
			    else
			   {
				if(n==4 && p==2)
					System.out.print("impossible");
				else
				{
					if(n==3 && p==3)
						System.out.print("aba");
			       else
				  {
				if(n%p==0)
				{
					if(p%2==0)
					{
						if(n%4==0)
						{
						for(i=0;i<n/4;i++)
							System.out.print("abba");
						}
						else
						{
						
							for(i=0;i<n/3;i++)
							System.out.print("aba");
							
							
						}
					}
					else
					{
						char c[]=new char[p];
						c[0]='a';
						c[p-1]='a';
						for(i=1;i<p-1;i++)
							c[i]='b';
						String s1=String.valueOf(c); 
						for(i=1;i<=n/p;i++)
							System.out.print(s1);
					}
				}
				else
					System.out.print("impossible");
			}
		}
			   }
			}
			System.out.println();
	}
}
}