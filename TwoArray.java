import java.util.Arrays;

public class TwoArray {


    public static void Print(int arr[][],int r1,int r2,int c1,int c2){
           for (int i = r1; i < r2; i++) {
             for (int j = c1; j < c2; j++) {
                  System.out.println(Arrays.deepToString(arr[i][j]));
             }
           }
    }


    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 4, 5},
            {6, 7, 9, 0},
            {22, 34, 5, 6},
            {12, 34, 54, 65}
        };
        Print(arr,0,4,2,4);
    }
}
