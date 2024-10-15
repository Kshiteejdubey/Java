// import java.util.*;
// public class occurence {

//     public int count(String str,char ch){
//              int count = 0;
//              for (int i = 0; i <str.length(); i++) {
//                   if(str.charAt(i)==ch){
//                       count++;
//                   }
//              }
//              return count;
//     }
//     public static void main(String[] args) {
//     occurence result=new occurence();
//    int result1= result.count("kshiteeeeeeej", 'e');
//    System.out.println(result1);
//     }
// }

// import java.util.*;
// import java.lang.Math;

// public class occurence {

//     public void arm(int num){
//        String str = String.valueOf(num);
//        int length  = str.length();
//        double sum=0;
         
//          while (num!=0) {
//              int rem = num%10;
//              double rev= Math.pow(num, length);
//               sum = sum+rev;
//               num=num/10;
//          }
//          System.out.println(sum);   

//     }

//     public static void main(String[] args) {
//             occurence result = new occurence();
//             int result1 =  result.arm(153);
//             System.out.println(result1);
//     }
// }





// import java.util.*;

// public class occurence {

//     public static void main(String[] args) {
        
//         int arr[] = {5,10,20,15,50,40};
//         int num=0;

//         for (int i = 1; i < arr.length-1; i++) {
//              if (arr[i]>=arr[i+1] || arr[i]>=arr[i-1]) {
//                num= arr[i];
//              }
//         }
//         System.out.println(num);


//     }
// }


// import java.util.*;

// public class occurence {
 
//     public void printnum(int n){

//         // if (n==0 || n==1) {
//         //      return fab(n);
//         // }

//     if (n>0) {
//         printnum(n-1);
//         System.out.println(n); 
//     }

//     }

//     public static void main(String[] args) {
         
//         occurence result =new occurence();
              
//          result.printnum(10);
         
//     }
// }
