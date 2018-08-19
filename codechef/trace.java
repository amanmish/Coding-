import java.util.*;
class code49
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int a[][]=new int[n][n];
			int i,j,k;
			k=n+1;
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
					a[i][j]=sc.nextInt();
			}
			