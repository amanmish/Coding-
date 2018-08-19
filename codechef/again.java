
import java.io.*;
import java.util.InputMismatchException;
 
/*
        CODE WRITTEN BY RITWIK SHANKER
 */
class AF
{
    public static void main(String[] args) throws Exception
    {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        /*
        EXAMPLE
        int a = in.readInt();
        String b = in.readString();
        out.printLine(a);
        */
        int t = in.readInt();
        while (t-- > 0)
        {
            int n = in.readInt();
            int k = in.readInt();
            int s = in.readInt();
            if (k > n)
            {
                out.printLine("-1");
            }
            else
            {
                if (s < 7)
                {
                    int f = s * k;
                    if (f % n == 0)
                    {
                        out.printLine(f / n);
                    }
                    else
                    {
                        out.printLine(f / n + 1);
                    }
                }
                else
                {
                    if (6 * (n - k) < k)
                    {
                        out.printLine("-1");
                    }
                    else
                    {
                        int f = s * k;
                        if (f % n == 0)
                        {
                            out.printLine(f / n);
                        }
                        else
                        {
                            out.printLine(f / n + 1);
                        }
 
                    }
                }
            }
        }
    }
 
}