import java.util.*;
class code9
{
	public  static  void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int x,y;
			x=sc.nextInt();
			y=sc.nextInt();
			int sum=x+y;
			int z=0;
			int sum1;
			while(true)
			{
				z++;
				sum1=sum+z;
				if(prime(sum1))
				{	
					System.out.println(z);
					break;
				}	
			}
		}
	}
	public static boolean prime(int x)
	{
		int i,c=0;
		for(i=2;i<x;i++)
		{
			if(x%i==0)
			{
				c++;
				break;
			}
		}
		if(c==0)
			return true;
			return false;
	}
}