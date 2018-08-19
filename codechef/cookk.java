import java.util.*;
class code14
{
	public static void main(String ar[])
	{
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		
		while(t-->0)
		{
			int n=sc.nextInt();
			
			String s[]=new String[n];
			String a[]=new String[]{"cakewalk", "simple", "easy", "easy-medium", "medium", "medium-hard", "hard"};
			int i,c=0;
			for(i=0;i<n;i++)
				s[i]=sc.next();
			int j=0;
			if(n<5)
				System.out.println("no");
			else
			{
				for(i=0;i<n;i++)
				{
					for(j=0;j<7;j++)
					{
						if(j==0 || j==1 || j==2)
						{
						if(s[i].equals(a[j]))
						{
							a[j]="0";
							break;
						}
						}
					  if(j==3)
						{
							if(s[i].equals(a[j]))
							{
								a[j]="0";
								a[j+1]="0";
								
								break;
							}
						}
						if(j==4)
						{
							if(s[i].equals(a[j]))
							{
								a[j]="0";
								a[j-1]="0";
								break;
							}
						}
						if(j==5)
						{
						    if(s[i].equals(a[j]))
							{
								a[j]="0";
								a[j+1]="0";
								break;
								
							}
						}
						if(j==6)
						{
						    if(s[i].equals(a[j]) || s[i].equals(a[j-1]))
							{
								a[j]="0";
								a[j-1]="0";
								break;
							
							}
						}
						
					}
				}
				for(i=1;i<7;i++)
			    {
				   if(a[0].equals(a[i]))
					c++;
			    }
			
			if(c==6)
				System.out.println("Yes");
			else
				System.out.println("No");
			}
			
		}
	}
}
					
						
		