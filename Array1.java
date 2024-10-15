import java.util.*;


public class Array1{

    public static void main(String[] args) {
        int[] arr={2,4,8,3,24,9,0,24,8,3,4};
    //     int[] brr = new int[arr.length];
    //     int temp =0;
    //    int unique = 0;

    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i+1; j < arr.length; j++) {
    //              if (arr[i]>arr[j]) {
    //                  temp =arr[i];
    //                  arr[i] = arr[j];
    //                  arr[j] = temp ;
    //              }
    //         }
    //     }

    //   for (int i = 0; i < brr.length; i++) {
    //       if( i == 0 || arr[i] != arr[i-1]){
    //          brr[unique] = arr[i];
    //          unique++;
    //       }
    //   }

    //     for (int i = 0; i < unique; i++) {
    //          System.out.println(brr[i]);
    // 
//}

HashSet<Integer> hs = new HashSet<>();

for (int num :arr) {
     hs.add(num);
}

     System.out.println(hs);

    }

}