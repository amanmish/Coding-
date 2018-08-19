//Length of Longest palindromic substring from a given string
import java.util.*;
class LongestPalindrme
{
	
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int ans=checkPalindrome(str);
		System.out.println(ans);
	}
	static int checkPalindrome(String s)
	{
		int n=s.length();
		int end=0;
		int start=0;
		boolean t[][]=new boolean[n][n];
		//length 1palindrome
		for(int i=0;i<n;i++)
			t[i][i]=true;
		// length 2 palindrome
		for(int i=0;i<n-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				t[i][i+1]=true;
				end=2;
			}
		}
		// for greater then 2
		for(int k=3;k<n;k++)
		{
			for(int i=0;i<n-k+1;i++)
			{
				int j=i+k-1;
				if(t[i+1][j-1]==true&& s.charAt(i)==s.charAt(j))
				{
					t[i][j]=true;
					if(k>end)
					{
						start=i;
						end=k;
					}
				}
			}
		}
		return end;
		
	}
}