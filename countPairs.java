public class countPairs {

    public int count(int[] arr,int num){
        int count =0;

        for (int i = 0; i < arr.length; i++) {
             for (int j = i+1; j < arr.length; j++) {
                  if (arr[i] + arr[j] == num) {
                     count++;
                  }
             }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,7,-1,5};
        int target = 6;
        countPairs ct = new countPairs();
        int result = ct.count(arr, target);
        System.out.println(result);
    }
}
