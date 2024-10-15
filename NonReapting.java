import java.util.HashSet;

import org.xml.sax.HandlerBase;

public class NonReapting {
    public static void main(String[] args) {

        int[] arr = { 3, 5, 12, 45, 6, 3, 5, 6 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            boolean isResult = false;
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && arr[i] == arr[j]) {
                    isResult = true;
                    break;
                }
            }
            if (!isResult) {
                System.out.println(arr[i]);
            }
        }

    }

}