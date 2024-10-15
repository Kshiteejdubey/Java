public class countNumber {

    public static void main(String[] args) {
        int[] arr = {2,3,8,2,9};
        double power = 0;

        for (int i = 0; i < arr.length; i++) {
             for (int j = i+1; j < arr.length; j++) {
                  int temp  = arr[j] - arr[i];
                     power = temp*temp;
                     System.out.println(power);
                     break;
             }
        }
    }
}