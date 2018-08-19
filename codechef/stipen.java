import java.util.*;
class code15
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			int i,avg=0,c=0,d=0;
			for(i=0;i<n;i++)
				a[i]=sc.nextInt();
			for(i=0;i<n;i++)
			{
				avg=avg+a[i];
				if(a[i]==5)
				{
					if(c>=1)
					{}
				    else
					c++;
				}
				if(a[i]<=2)
				{
					d++;
					break;
				}
			}
			if(d==1)
				System.out.println("No");
			else{
			avg=avg/n;
				if(avg>=4)
					c++;	
			
			if(c==2)
				System.out.println("Yes");
			else
				System.out.println("No");
			}
		}
	}
}