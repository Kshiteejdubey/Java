public class CommonElement {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,9,1,0};
        int[] brr={6,9,1,34,76,23,4,8};
        int[] crr={6,9,1,34,23,54,4,8};
        int[] drr=new int[arr.length + brr.length ];
        int[] err = new int[drr.length];
        int k=0;

        for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < brr.length; j++) {
                    if (arr[i] == brr[j]) {
                        drr[k++] = arr[i];
                        break;
                    }
             }
        }

        int l=0;
        for (int i = 0; i < drr.length; i++) {
            for (int j = 0; j < crr.length; j++) {
                  if (drr[i] == crr[j]) {
                       err[l++] = drr[i];
                       break;
                  }
            }
        }

        for (int i = 0; i < err.length; i++) {
             System.out.println(err[i]);
        }
    }
}
