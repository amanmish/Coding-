import java.util.*;
import java.io.IOException;
class fun
{
	public static void main(String ar[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			String a=sc.nextLine();
			int i,count=0;
			for(i=0;i+1<a.length();i++)
			{
				if(a.charAt(i)=='<' && a.charAt(i+1)=='>')
					count++;
			}
			System.out.println(count);
			t--;
		}
	}
}