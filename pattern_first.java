public class pattern_first {

    public static void main(String[] args) {
        
        for (int i = 5; i >=0; i--) {
             for (int j = 0; j <=i; j++) {
                    System.out.print("*");
             }
             System.out.println("");
        }
    }
}


// public class pattern_first {

//     public static void main(String[] args) {
//         int[] arr = {6,3,7,2,1,3,6};
//         int count=0;
//         for (int i = 0; i < arr.length-1; i++) {
//               if (arr[i] == arr[i+1]) {
//                   count++;
//               }
//         }
//         System.out.println(count);
//     }
// }

