
import java.util.*;
class Unionset
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0)
        {
            int N = scn.nextInt();
            int K = scn.nextInt();
            int checker[][] = new int[N][K + 1];
            for (int i = 0; i < N; ++i)
            {
                int len = scn.nextInt();
                while (len > 0)
                {
                    len--;
                    int temp = scn.nextInt();
                    checker[i][temp] = 1;
                }
            }
            long dis = 0;
            for (int i = 0; i < N; ++i)
            {
                for (int j = i + 1; j < N; ++j)
                {
                    long ans = 0;
                    for (int k = 1; k <= K; ++k)
                    {
                        if (!(checker[i][k] == 1 || checker[j][k] == 1))
                        {
                            ans = 1;
                            break;
                        }
 
                    }
                    if (ans == 0)
                    {
                        dis++;
                    }
                }
            }
            System.out.println(dis);
        }
    }
}