import java.util.*;
class code24
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
			
			int i;
			String a=sc.nextLine();
			char b[]=a.toCharArray();
			int c=0,h=0,f=0,e=0,j,g=0,d=0,r=0,q=0,y=0,l=0;
			for(i=0;i<b.length;i++)
			{
				if(b[i]=='A')
				{
					c++;
					f=0;
					r=0;
					y=0;
					for(j=i+1;j<b.length;j++)
					{
						if(b[j]=='A')
						{
							r++;
							f++;
							d=j;
							break;
						}
						if(b[j]=='B')
							break;
					}
					if(f==1 && d!=i+1)
					{
						y=r+(d-i-2);
					}
					c=c+y;
						
				}
				if(b[i]=='B')
				{
					h++;
					e=0;
					l=0;
					q=0;
					for(j=i+1;j<b.length;j++)
					{
						if(b[j]=='B')
						{
							q++;
							e++;
							g=j;
							break;
						}
						if(b[j]=='A')
							break;
					}
					if(e==1 && g!=i+1)
						l=q+(g-i-2);
					h=h+l;
				}
			}
			System.out.println(c+" "+h);
		}
	}
}
	