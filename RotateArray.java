public class RotateArray {

    public void rotate(int[] arr, int num){
          int last_ele = arr[arr.length-1];

          for (int i = arr.length-1; i >0; i--) {
             arr[i]=arr[i-1];
          }
          arr[0] = last_ele;

          for (int i = 0; i < arr.length; i++) {
             System.out.println(arr[i]);
          }
    }

    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5};
       int num=5;

       RotateArray Ra= new RotateArray();
     Ra.rotate(arr, num);
     


    }
}