//Print all the permutation of the given String
import java.util.*;
class AllPermutation
{
	
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		permute(s,0,s.length()-1);
	}
	static void permute(String str,int l,int r)
	{
		if(l==r)
			System.out.println(str);
		else
		{
			for(int i=l;i<=r;i++)
			{
				str=swap(str,l,i);
				permute(str,l+1,r);
				str=swap(str,l,i);
			}
		}
	}
	static  String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
 
}