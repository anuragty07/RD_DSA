package javanew;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {

         Scanner sc= new Scanner(System.in);
        System.out.println("enter row");
        int r=sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r-i; j++) {
                System.out.print(" ");
                
            }
            
           for (int j = 1; j < 6; j++) {
           System.out.print("*");
             
           }
           
          System.out.println(); 
    }
    
}

        
    }
    