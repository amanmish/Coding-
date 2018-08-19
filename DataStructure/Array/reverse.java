import java.util.*;
class reverse
{
	public static void main(String ar[])
	{
		String s="AmanMishra";
		printReverse(s);
	}
	static void  printReverse(String str)
	{
		if(str==null || str.length()<=1)
			System.out.println(str);
		else
		{
			System.out.print(str.charAt(str.length()-1));
			printReverse(str.substring(0,str.length()-1));
		}
	}
}

