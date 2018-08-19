import java.util.*;
import java.lang.*;
class cook47
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int c1=2*b-a;
			int b1=(a+c)/2;
			int a1=2*b-c;
			int ans1=c1-c;
			if(ans1<0)
				ans1=(-1)*ans1;
			int ans2=b1-b;
			if(ans2<0)
				ans2=(-1)*ans2;
			int ans3=a1-a;
			if(ans3<0)
				ans3=(-1)*ans3;
			//System.out.print(ans1+" " +ans2+" "+ans3+" ");
				if(ans1<ans3 && ans1<ans2)
					System.out.println(ans1);
				else
					if(ans2<ans1 && ans2<ans3)
						System.out.println(ans2);
					else
						System.out.println(ans3);
		}
	}
}

				