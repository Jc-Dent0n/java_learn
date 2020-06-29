import java.lang.reflect.Array;
import java.util.*;

public class FOR_TESTS_TMP {
    public static void main(String[] args) {
        int N_y = 5;
        int M_x = 5;
        int[] needles = {1,1,2,1,5,1,3,2,4,5};
        int[][] arr_sqr = new int[N_y][M_x];
        int Days = 0;
        int Max_Days = N_y+M_x-1;

        boolean Flag = false;

        do{
            Days++;

            for (int i = 0; i < N_y; i++) {
                for (int j = 0; j < M_x; j++) {
                    for(int k = 0; k < needles.length; k=k+2){
                        //Days = 1;
                        if(needles[k] == i+1 && needles[k+1] == j+1){
                            //System.out.println((i+1)+""+(j+1));
                            arr_sqr[i][j] += 1;
                            //System.out.println(arr_sqr[i][j]);
                        }
                    }
                    if(i-1 >= 0){
                        if(arr_sqr[i][j] >= 2) {
                            if (arr_sqr[i - 1][j] == 0) {
                                arr_sqr[i - 1][j]++;
                            }
                        }
                        if(arr_sqr[i-1][j] >= 2){
                            if(arr_sqr[i][j] != Days){
                                arr_sqr[i][j]++;
                                //System.out.println(arr_sqr[i][j] + " " + i + "" + j);
                            }
                        }
                        if(arr_sqr[i-1][j] == arr_sqr[i][j]){
                            System.out.println(arr_sqr[i-1][j] + " " + i + "" + j + "" + arr_sqr[i][j]);
                        }
                    }
//                    if(j-1 >= 0){
//                        if(arr_sqr[i][j-1] >= 2){
//                            if(arr_sqr[i][j] != Days){
//                                arr_sqr[i][j]++;
//                                //System.out.println(arr_sqr[i][j] + " " + i + "" + j);
//                            }
//                        }
//                    }
                }
            }

        }while(Days < 2);

        System.out.println(arr_sqr[3][0]);
        System.out.println("\n\n");

        for (int[] anArr : arr_sqr) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }
    }
}
