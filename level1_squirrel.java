import java.util.*;

public class Level1
{
    public static int squirrel (int N)
    {
        if(N == 0)
        {
            N = 1;
        }
        else if (N <= 12)
        {
            N = (int) (Math.round(Math.sqrt(2 * Math.PI * N) * (Math.pow((N / Math.E), N)) * Math.exp(1/((12 * N) + 0.75))));
            String[] str_N = String.valueOf(N).split("");
            N = Integer.valueOf(str_N[0], 10);
        }
        else
        {
            N = 2;
        }

        return N;
    }
}
