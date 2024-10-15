// import java.util.*;
// import java.util.stream.*;

// public class Stream {
//     public static void main(String[] args) {
//         List<Integer> al = Arrays.asList(1,4,6,2,6,3,1,6,7);

//        Stream<Integer> li = al.stream();
     
//         li.filter(n -> n%2);
//         System.out.println(li);
//     }
// }


public class Stream {

    public static void main(String[] args) {
       String str = "kshiteej";
       String temp = "";
       int num = str.length();
       System.out.println(num);
       for (int i = str.length()-1; i >=0; i--) {
            temp  += str.charAt(i);
       }
       System.out.println(temp);
    }
}