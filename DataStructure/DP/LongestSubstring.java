//Longest Common Substring between two given strings
import java.util.*;
class LongestSubstring
{
	
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two Strings");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int ans=subString(s1,s2);
		System.out.println(ans);
	}
	static int subString(String s1,String s2)
	{
		int n1=s1.length();
		int n2=s2.length();
		int max=0;
		int t[][]=new int[n1+1][n2+1];
		for(int i=1;i<=n1;i++)
		{
			for(int j=1;j<=n2;j++)
			{
				if(s1.charAt(i-1)==s2.charAt(j-1))
					t[i][j]=t[i-1][j-1]+1;
				if(max<t[i][j])
					max=t[i][j];
			}
		}
		return max;
	}
}