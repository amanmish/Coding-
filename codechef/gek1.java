import java.util.*;
class gek1
{
	public static void main(String ar[])
	{
		Stack<String> g = new Stack<String>();
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
			//sc.nextLine();
			String s;
			//sc.nextLine();
			s=sc.nextLine();
			char c[]=s.toCharArray();
			int l=c.length;
			int i,count=0;
			char b[]=new char[l];
			b[0]='l';
			int j=0,k=0,p=0;
			for(i=0;i<l;i++)
			{
				if(c[i]=='.'|| p==1)
				{
					String str = String.valueOf(b);
					g.push(str);
					k++;
					g.push(".");
					k++;
					if(p==1)
						g.pop();
					j=0;
				}
				else
				{
					if(i==l-2)
					{
					b[j]=c[i];
					j++;
					b[j]=c[i+1];
					j++;
					p++;
					}
					else
					{
						b[j]=c[i];
						j++;
					}
						
				}
				
			}
			for(i=0;i<k-1;i++)
			{
				//String a=g.pop();
				System.out.print(g.pop());
			}
			System.out.println();
		}
	}
}