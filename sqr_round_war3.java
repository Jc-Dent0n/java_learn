import java.util.*;

public class FOR_TESTS_TMP {
    public static void main(String[] args) {
        int N_y = 6;
        int M_x = 7;
        int[] needles = {3,3,5,4,4,4,5,5,6,5};
        int[][] arr_sqr = new int[N_y][M_x];
        int Days = 0;
        for (int i = 0; i < N_y; i++) {
            for (int j = 0; j < M_x; j++) {
                for(int k = 0; k < needles.length; k=k+2){
                    Days = 1;
                    if(needles[k] == i+1 && needles[k+1] == j+1){
                        //System.out.println((i+1)+""+(j+1));
                        arr_sqr[i][j] += Days;
                    }

                }
                Days++;
            }
        }

        for (int i = 0; i < N_y; i++) {
            for (int j = 0; j < M_x; j++) {
                if(arr_sqr[i][j] == 1) {
                    arr_sqr[i][j]++;
                }
                if(i-1 >= 0 && j-1 >= 0){
                    if(arr_sqr[i][j] >= 2){
                        if(arr_sqr[i-1][j] == 0){
                            arr_sqr[i-1][j] = 1;
                        }
                        if(arr_sqr[i][j-1] == 0){
                            arr_sqr[i][j-1] = 1;
                        }
                    }
                    else{
                        if(arr_sqr[i-1][j] >= 2){
                            arr_sqr[i][j] = 1;
                        }
                        if(arr_sqr[i][j-1] >= 2){
                            arr_sqr[i][j] = 1;
                        }
                    }
                }
            }
        }

        System.out.println("\n\n");





        for (int[] anArr : arr_sqr) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }
       // System.out.println(Days);
    }
}
