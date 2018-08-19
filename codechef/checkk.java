import java.util.ArrayList;
import java.util.*;
 class SubSet_sum_problem
{
    static boolean[][] dp;
      
    static void display(ArrayList<Integer> v)
    {
       System.out.println(v);
    }
    static void printSubsetsRec(int arr[], int i, int sum, 
                                         ArrayList<Integer> p)
    {
        if (i == 0 && sum != 0 && dp[0][sum])
        {
            p.add(arr[i]);
            display(p);
            p.clear();
            return;
        }
        if (i == 0 && sum == 0)
        {
            display(p);
            p.clear();
            return;
        }
        if (dp[i-1][sum])
        {
            ArrayList<Integer> b = new ArrayList<Integer>();
            b.addAll(p);
            printSubsetsRec(arr, i-1, sum, b);
        }
      
        // If given sum can be achieved after considering
        // current element.
        if (sum >= arr[i] && dp[i-1][sum-arr[i]])
        {
            p.add(arr[i]);
            printSubsetsRec(arr, i-1, sum-arr[i], p);
        }
    }
      
    // Prints all subsets of arr[0..n-1] with sum 0.
    static void printAllSubsets(int arr[], int n, int sum)
    {
        if (n == 0 || sum < 0)
           return;
      
        // Sum 0 can always be achieved with 0 elements
        dp = new boolean[n][sum + 1];
        for (int i=0; i<n; ++i)
        {
            dp[i][0] = true;  
        }
      
        // Sum arr[0] can be achieved with single element
        if (arr[0] <= sum)
           dp[0][arr[0]] = true;
      
        // Fill rest of the entries in dp[][]
        for (int i = 1; i < n; ++i)
            for (int j = 0; j < sum + 1; ++j)
                dp[i][j] = (arr[i] <= j) ? (dp[i-1][j] ||
                                           dp[i-1][j-arr[i]])
                                         : dp[i - 1][j];
        if (dp[n-1][sum] == false)
        {
            System.out.println("There are no subsets with" + 
                                                  " sum "+ sum);
            return;
        }
      
        // Now recursively traverse dp[][] to find all
        // paths from dp[n-1][sum]
        ArrayList<Integer> p = new ArrayList<Integer>();
        printSubsetsRec(arr, n-1, sum, p);
    }
     
    //Driver Program to test above functions
    public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		int n,x;
		n=sc.nextInt();
		x=sc.nextInt();
		int arr[]=new int[n+1];
		int i;
		int s=n*(n*1)/2;
		s=s-x;
		for(i=1;i<=n;i++)
		{
			if(i==x)
				continue;
			else
			arr[i]=i;
		}
		for(i=0;i<n-1;i++)
			System.out.print(arr[i]+" ");
		System.out.println(s);
		if(s%2!=0)
			System.out.println("impossible");
		else
		{
        int sum = s/2;
        printAllSubsets(arr,n,sum);
		}
    }
}