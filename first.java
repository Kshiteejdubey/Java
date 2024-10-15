public class first {
  public static void main(String[] args) {
    int[] arr = { 10, 30, 50, 60, 20, 40, 80, 90 };

    // int mid=0;
    // // boolean flag =true;
    // // int maxEle= arr[0];
    // int[] arr1;

    int temp;
    for (int i = 0; i < arr.length; i++) {
      // mid= (i+(i-1))/2;
      // if ((arr[mid+1])>arr[mid] ||(arr[mid-1])>arr[mid]){
      // flag =false;
      // }
      // else{
      // flag = true;
      // }
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    // for (int i = 0; i < arr.length; i++) {
    //      System.out.print(arr[i] + " ");
    // }



    // System.out.println(maxEle);
    // if (flag) {
    // System.out.println(arr[mid]);
    // }
    // else{
    // System.out.println("");
    // }

  }
}
