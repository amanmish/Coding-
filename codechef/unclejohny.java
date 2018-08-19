
import java.util.*;
class code1
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t;
		t=sc.nextInt();
		while(t>0)
		{
			int n=sc.nextInt();
			int i,j,temp;
			int a[]=new int[n];
			for(i=0;i<n;i++)
				a[i]=sc.nextInt();
			int b=sc.nextInt();
			b=b-1;
			int c=a[b];
			int d=0;
			Arrays.sort(a);
			for(i=0;i<n;i++)
			{
				if(a[i]==c)
					d=i;
			}
		System.out.print(d+1);
		System.out.println();
		t--;
		}
	}
}