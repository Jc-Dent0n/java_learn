import java.util.*;

public class Level1 {

    public static void main(String[] args) {
        int N_y = 4;
        int M_x = 3;
        int[] needle = {2,2,1,3};
        int needle_L = needle.length;
        int S_NM = N_y*M_x;

        StringBuilder Sqr_cells = new StringBuilder();
        //StringBuilder S_MN_cells = new StringBuilder();
        int iteration = 0;

        for(int i = 0; i< N_y; i++){
            for(int j = 0; j< M_x; j++){
                String Cell_X = String.valueOf(i+1);
                String Cell_Y = String.valueOf(j+1);
                Sqr_cells.append(Cell_Y).append(Cell_X);
                //S_MN_cells.append(iteration++);
            }
        }
        // Здесь получили все координаты поля в XY - 11 21 31 12 22 32 13 23 33 14 24 34
        //System.out.println(Sqr_cells);

        // Здесь получили все ячейки NM - 1 2 3 4 5 6 7 8 9 10 11 12
        //System.out.println(S_MN_cells);

        // Здесь общая площадь
        //System.out.println(S_NM);
        StringBuilder Needle_cells = new StringBuilder();
        int Days = 0;
        for(int i=0; i<Sqr_cells.length();i=i+2){
            for(int j=0;j<needle_L; j=j+2){
                if(Character.getNumericValue(Sqr_cells.charAt(i)) == needle[j] &&
                   Character.getNumericValue(Sqr_cells.charAt(i+1)) == needle[j+1]){
                    Days = 1;
                    String Needle_Cell = String.valueOf((i+1)/2);
                    Needle_cells.append(Needle_Cell);
                    //System.out.println(Sqr_cells.charAt(i) + "" + Sqr_cells.charAt(i+1) + " - " + i + " - " + needle[j] + needle[j+1]);
                }
            }
        }
        //System.out.println(Needle_cells + "" + Days);
        for (int i=0;i<S_NM;i++){
            if (i == Character.getNumericValue(Needle_cells.charAt(iteration))){
                iteration++;
                //System.out.println(i + "-" );
                if(iteration == Needle_cells.length()){
                    break;
                }
            }

        }
        System.out.println((char) (Needle_cells.charAt(0)+1) + " " +
                           (char) (Needle_cells.charAt(0)+1 - M_x) + " " +
                           (char) (Needle_cells.charAt(0)+1 +1) + " " +
                           (char) (Needle_cells.charAt(0)+1 + M_x));
    }
}
