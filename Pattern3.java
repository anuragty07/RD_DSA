package javanew;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("enter row");
        int r=sc.nextInt();
        for (int i = 0; i <= r; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }

    }
    
}
