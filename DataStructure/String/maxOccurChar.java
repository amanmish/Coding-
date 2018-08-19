//maximum occurrence of a character in String
import java.util.*;
class Max
{
	static final int ascii=256;
	public static void  main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String str= sc.nextLine();
		int count[]=new int[ascii];
		int len=str.length();
		for(int i=0;i<str.length();i++)
			count[str.charAt(i)]++;
		int max=0;
		char result=' ';
		for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
		System.out.println(result);
	}
}