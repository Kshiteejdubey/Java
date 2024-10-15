import java.util.Arrays;

public class SubArray {
    public static void main(String[] args) {
        int[] arr = {2,4,7,9,3};

        for(int start=0; start <arr.length;start++){
            for(int end =start;end<arr.length;end++){
                int[] SubArray = new int[end - start +1];

                System.arraycopy(arr, start, SubArray, 0, SubArray.length);
                System.out.println(Arrays.toString(SubArray));
            }
        }
    }
}