import java.util.*;
class bear
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
			String s=sc.nextLine();
			char a[]=s.toCharArray();
			int c=0;
			int l=a.length;
			if(a[0]=='1')
				c++;
			for(int i=1;i<l;i++)
			{
				if(a[i]=='1'&& a[i-1]=='0')
					c++;
			}
			if(c==1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
			
			