import java.util.Arrays;

public class SubArray1 {
    public static void main(String[] args) {
        // int[] arr = {3,56,2,6,8,12,9};
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        // for (int start = 0; start < arr.length; start++) {
        //      for (int end = start; end < arr.length; end++) {
        //         for (int i = start; i <end; i++) {
        //               System.out.print(arr[i]+" ");
        //          }
        //          System.out.println();
        //     }
        // }



        // for (int start = 0; start < arr.length; start++) {
        //     for (int end = start; end < arr.length; end++) {
        //           int[] SubArray = new int[end-start+1];

        //           System.arraycopy(arr, start, SubArray, 0, SubArray.length);
        //           System.out.println(Arrays.toString(SubArray));
        //     }
        // }


         int currsum =0 ;
         int maxsum=0;
         for (int i = 0; i < arr.length; i++) {
              currsum = currsum+arr[i];
              if (currsum>maxsum ) {
                  maxsum = currsum;
              }
              if (currsum<0) {
                 currsum =0;
              }
         }
         System.out.println(maxsum);


    }
}
