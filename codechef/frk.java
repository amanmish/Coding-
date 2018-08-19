import java.util.*;
import java.lang.*;
class cook46
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int i,j;
		String s="";
		int c=0;
		sc.nextLine();
		for(i=0;i<t;i++)
		{
			s=sc.nextLine();
			int l=s.length();
			for(j=0;j<l;j++)
			{
				int count=0;
				if(j==l-1)
					break;
				String sub=s.substring(j,j+2);
				//System.out.print(sub+" ");
				if((sub.equals("ch")) || (sub.equals("he")) || (sub.equals("ef")))
				{
					count++;
					c++;
				}
				if(count==1)
					break;
			}
		}
		System.out.print(c);
	}
}
				