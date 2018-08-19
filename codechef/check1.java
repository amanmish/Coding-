import java.util.*;
class code37
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int b[]=new int[15];
		int n=sc.nextInt();
		int i,j;
		for(i=0;i<n;i++)
			b[i]=sc.nextInt();
		int sum=0;
			int max=Integer.MIN_VALUE;
             for(i=0;i<n;i++)
			{	 
                sum=b[i];				
				for(j=i+1;j<n;j++)
				{
					sum=sum+b[j];
					if(sum>max)
						max=sum;
				}
			}
			System.out.println(max);
	}
}