import java.util.Scanner;

class Myclass extends Thread{
    public void run(){
        System.out.println("Hello world");

        Scanner sc = new Scanner(System.in);
        sc.next();
         String st = sc.nextLine();

         System.out.println("print number");
         sc.close();
    }

}
public class Mythread {
     public static void main(String[] args) {
         Myclass res = new Myclass();
         res.start();
     }
}
