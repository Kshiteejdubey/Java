import java.util.*;
class Mythread extends Thread{
       public void run(){
        System.out.println("thread is start");
       }
}



public class Multithread {
    public static void main(String[] args) {
         Mythread thread = new Mythread();
         thread.start();
    }
}
