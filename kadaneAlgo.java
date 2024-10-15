import java.util.*;
import java.math.*;

public class kadaneAlgo {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxEndingHere = arr[0];
        int maxSofar = arr[0];

        for (int i = 1; i < arr.length; i++) {
              maxEndingHere = Math.max(arr[i],maxEndingHere+arr[i]);
              maxSofar = Math.max(maxSofar,maxEndingHere);
        }

        System.out.println(maxSofar);
    }
}
