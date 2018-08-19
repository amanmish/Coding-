import java.io.*;
class code40
{
	public static void main(String ar[])throws IOException
	{
		BufferedReader sc = new BufferedReader(new
        InputStreamReader(System.in));
		int t=Integer.parseInt(sc.readLine());
		while(t-->0)
		{
			String s;
			s=sc.readLine();
			long l=s.length();
			char c[]=s.toCharArray();
			int ll=0,i;
			long sum=0;
			long a,b,e,d;
			for(i=0;i<l-3;i++)
			{
				if((c[i]=='c' || c[i]=='h' || c[i]=='e' || c[i]=='f'))
				{
				a=(long)c[i];
				b=(long)c[i+1];
				d=(long)c[i+2];
				e=(long)c[i+3];
				if(a!=b && a!=d && a!=e && b!=d && b!=e && d!=e)
				{
				sum=a+b+e+d;
				if((c[i]=='c' || c[i]=='h' || c[i]=='e' || c[i]=='f') && (c[i+1]=='c' || c[i+1]=='h' || c[i+1]=='e' || c[i+1]=='f') && 
				(c[i+2]=='c' || c[i+2]=='h' || c[i+2]=='e' || c[i+2]=='f')&&(c[i+3]=='c' || c[i+3]=='h' || c[i+3]=='e' || c[i+3]=='f')&& sum==406)
					ll++;
				}
				}
			}
			if(ll==0)
				System.out.println("normal");
			else
				System.out.println("lovely"+" "+ll);
		}
	}
}