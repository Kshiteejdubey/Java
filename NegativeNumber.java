

public class NegativeNumber {
    public static void main(String[] args) {
         int[] arr ={2,35,2,543,-3,-5,2};
         int k=0;
         int[] brr= new int[arr.length];

         for (int i = 0; i < arr.length; i++) {
             if (arr[i]>0) {
                  brr[k++] = arr[i];
             }
         }

         for (int i = 0; i < brr.length; i++) {
             System.out.println(brr[i]);
         }
    }
}
