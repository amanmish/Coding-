import java.util.*;
class rect
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int a,b,c,d,p=0;
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			d=sc.nextInt();
			if(a==b && c==d)
				p++;
			else
				if(a==c && b==d)
					p++;
				else
					if(a==d && b==c)
						p++;
			
					
			if(p==1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
				