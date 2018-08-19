import java.util.*;
class code25
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
			
			int i,e=0;
			String a=sc.nextLine();
			char c[]=a.toCharArray();
			int d=0;
			if(c[0]=='b')
			{
				for(i=1;i<c.length;i=i+2)
				{
					if(c[i]!='g')
					{
						d++;
					}
				}
				for(i=2;i<c.length;i=i+2)
				{
					if(c[i]!='b')
					{
						d++;
					}
				}
			}
			else
			{
				for(i=1;i<c.length;i=i+2)
				{
					if(c[i]!='b')
					{
						d++;
					}
				}
				for(i=2;i<c.length;i=i+2)
				{
					if(c[i]!='g')
					{
						d++;
					}
				}
			}
			if(c[0]=='b')
			{
				for(i=0;i<c.length;i=i+2)
				{
					if(c[i]!='g')
					{
						e++;
					}
				}
				for(i=1;i<c.length;i=i+2)
				{
					if(c[i]!='b')
					{
						e++;
					}
				}
			}
			else
			{
				for(i=0;i<c.length;i=i+2)
				{
					if(c[i]!='b')
					{
						e++;
					}
				}
				for(i=1;i<c.length;i=i+2)
				{
					if(c[i]!='g')
					{
						e++;
					}
				}
			}
			if(d<e)
			System.out.println(d);
		else
			System.out.println(e);
		}
	}
}
				