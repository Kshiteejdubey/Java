
import java.util.*;
public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {2,6,4,7,3,7,6,2,2};
        int[] brr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
             for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]) {
                      int temp = arr[i];
                      arr[i] = arr[j];
                      arr[j] =temp;
                }
             }
        }

      

        for (int i = 1; i<arr.length; i++) {
            boolean isTrue = false;
             for (int j = 0; j < brr.length; j++) {
                 if (arr[i] == arr[j]) {
                     isTrue =true;
                     break;
                 }
             }

             int k=0;
             if (!isTrue) {
                  brr[k++] = arr[i];
             }
        }

      for (int i = 0; i < brr.length; i++) {
           System.out.println(brr[i]);
      }
        
      

        // HashSet<Integer> hs = new HashSet<>();
        
        // for (Integer num : arr) {
        //       hs.add(num);
        // }

        // System.out.println(hs);
    }
}
