import java.util.*;
public class StreamApi {

    public static void main(String[] args) {
        int[] arr = {2,3,5,2,6,7};

         Arrays.stream(arr).filter(n->n>4);
  
    }
}