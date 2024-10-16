public class MinimizeHeight {
    public static void main(String[] args) {
           int arr[] = {12, 6, 4, 15, 17, 10};
           int k=3;
           int ele=0;
           int max=0;
           int min=0;
           int arr2[] = new int[arr.length];
           for (int i = 0; i < arr.length; i++) {
              if (arr[i]>k) {
                     arr2[ele] =   arr[i]-k;
                     ele++;
              }
              else if(arr[i]<=k){
                arr2[ele]=arr[i]+k;
                ele++;
              }
           }

           for (int i = 0; i < arr2.length; i++) {
               if (arr2[i]>max) {
                   max = arr2[i];
               }
                if (arr2[i]<min  || arr2[i] != max) {
                   min = arr2[i];
               }
           }

           
           
           for (int i = 0; i < arr2.length; i++) {
               System.out.println(arr2[i]);
            }
            System.out.println(max-min);
        }
}
