import java.util.*;
class kode2
{
	public static void main(String ar[])
	{
		try{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int m,n;
			m=sc.nextInt();
			n=sc.nextInt();
			int []p;
			if(m%2==0)
				p=new int[]{n,1,n^1,0};
			else
				p=new int[]{m,m^n,m-1,(m-1)^n};
			System.out.println(p[(n-m)%4]);
			
		}
		}
		catch(Exception e)
		{}
	}
}