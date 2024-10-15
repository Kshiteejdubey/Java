public class MissingNumber {

      public int MissNum(int[] arr,int n){
        int sum =0;
                 
        for (int i = 0; i < n-1; i++) {
              sum += arr[i];
        }
        int expectedSum = (n*(n+1))/2;
         return expectedSum - sum;
      }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int num = 5;
         
        MissingNumber Mn = new MissingNumber();
 
        int result = Mn.MissNum(arr, num) ;

        System.out.println(result);
    }
}