package javanew;
import java.util.*;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n=sc.nextInt();
        int c=0;
        while (n!= 0) {
            n=n / 10;
            ++c;
          }
          System.out.println("no of digits");
          System.out.println(c);




    }
    
}
