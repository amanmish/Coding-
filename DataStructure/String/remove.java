import java.util.*;
class LongestPalindrme
{
	
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
			//System.out.println("Enter the String");
			String str=sc.nextLine();
			char c[]=str.toCharArray();
			List<Character> listC = new ArrayList<Character>();
			for (char d : c) 
			{
			   listC.add(d);
			}
			int n=listC.size();
			removeDuplicate(listC,n);
		}
	}
	static void removeDuplicate(List<Character> listC,int n)
	{
		 
            char ch=listC.get(0);
			//listC=new ArrayList<Character>();
            for(int i=1;i<listC.size();i++)
            {
                if(ch==listC.get(i))
                {
                    listC.remove(i);
                   // listC.remove(i-1);
                }
                else
                ch=listC.get(i);
            }
            int len=listC.size();
			//if(len==0)
				//return '';
            if(len!=n)
            removeDuplicate(listC,len);
            else
				for(int i=0;i<listC.size();i++)
					System.out.print(listC.get(i));
				//System.out.println();
            
	}
}
