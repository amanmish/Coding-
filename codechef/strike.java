import java.util.*;
class code50
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int p,q,count=0;
			String s=Integer.toString(n);
			char c[]=s.toCharArray();
			if(isPalin(c))
			{
				p=1;
				q=1;
			}
			else
			{
				p=0;
				q=1;
			}
			
			System.out.println(p+" " + q);
		}
	}
	static boolean isPalin(char str[])
	{
		int end = str.length;
		
		if(end == 0 || end==1) return true;
		int start = 0;
		end=end-1;
		while(start != end)
		{
			if(str[start] != str[end]) 
				return false;
			if((start-end)==-1)
				return true;
			start++;
			end--;
		}
		return true;
	}
}
			
				