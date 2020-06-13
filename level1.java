public class Level1
{
    public static int odometer(int [] oksana)
    {
        int count_of_arrs = oksana.length;
        int S_0 = oksana[0] * oksana[1];
        int S_Sub_Total = 0;
        for(int i = 1; i<count_of_arrs-2; i++)
        {
            if(i%2 != 0){
                int times = oksana[i+2] - oksana[i];
                S_Sub_Total += times * oksana[i+1];

            }
        }
        return S_0 + S_Sub_Total;
    }
}
