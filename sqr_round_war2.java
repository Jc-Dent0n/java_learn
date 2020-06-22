import java.util.*;

public class FOR_TESTS_TMP {
    public static void main(String[] args) {
        int N_x = 3;
        int M_y = 4;
        int[] needles = {1,2,3,4};
        int S_NM = N_x*M_y;
        StringBuilder needles_found = new StringBuilder();

        for(int i=1; i<=N_x;i++){
//            System.out.println("i - " + i);
            for (int j=1;j<=M_y;j++){
                //System.out.println("j - " + i+j);
                for (int k=0;k<needles.length;k=k+2){
                    if(needles[k] == i && needles[k+1] == j){
                        System.out.println(needles[k] + " " + i+j);
                        if((needles[k]-1)==0){
                            //System.out.println((int)(i-1) + "" + (int)(j-1) + " - за пределом");
                            needles_found.append(i+1).append(j).append(" if_1  ");
                            if(needles[k+1]-1 == 0){
                                needles_found.append(i).append(j+1).append(" if_1_1  ");
                            }
                            if (needles[k+1]+1 > M_y){
                                needles_found.append(i).append(j-1).append(" if_1_2  ");
                            }
                        }
                        if(needles[k]+1 > N_x){
                            needles_found.append(i-1).append(j).append(" if_2  ");
                            if(needles[k+1]-1 == 0){
                                needles_found.append(i).append(j+1).append(" if_2_1  ");
                            }
                            if(needles[k+1]+1 > M_y){
                                needles_found.append(i).append(j-1).append(" if_2_2  ");
                            }
                        }
                        if(needles[k]-1 > 0 && needles[k]+1 < N_x){
                            needles_found.append(i-1).append(j).append(" if_3  ");
                            needles_found.append(i+1).append(j).append(" if_3  ");
                            if(needles[k+1]-1 == 0){
                                needles_found.append(i).append(j+1).append(" if_3_1  ");
                            }
                            if(needles[k+1]+1 > M_y){
                                needles_found.append(i).append(j-1).append(" if_3_1  ");
                            }
                        }
                        if(needles[k+1]-1 > 0 && needles[k+1]+1 < M_y){
                            needles_found.append(i).append(j-1).append(" if_4  ");
                            needles_found.append(i).append(j+1).append(" if_4  ");
                            if(needles[k]-1 <= 0){
                                needles_found.append(i+1).append(j).append(" if_4_1  ");
                            }
                            if(needles[k]+1 < N_x){
                                needles_found.append(i-1).append(j).append(" if_4_2  ");
                            }
                        }
                        needles_found.append(i).append(j).append(" ");
                    }
                }

            }
        }
        System.out.println("_____ " + needles_found);
    }
}
