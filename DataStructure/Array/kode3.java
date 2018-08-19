import java.util.*;
class kode3
{
	public static void main(String ar[])
	{
		try{
			Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			long n=sc.nextInt();
			long[] binaryNum = new long[1000000000];
			long c=0;
  
        // counter for binary array
        int i = 0;
        while (n > 0) 
        {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
  
        for (int j = i - 1; j >= 0; j--)
		{ 
	if(binaryNum[j]==1)
		c++;
		}
		System.out.println(c);
		}
		}
		catch(Exception e)
		{}
	}
}
		