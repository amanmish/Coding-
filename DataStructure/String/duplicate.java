import java.util.*;
class Duplicate
{
	static void remove(String str)
	{
		LinkedHashSet<Character>lhs=new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++)
			lhs.add(str.charAt(i));
		for(Character c:lhs)
			System.out.print(c);
	}
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		remove(s);
	}
}
