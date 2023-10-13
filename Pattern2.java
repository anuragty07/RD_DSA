package javanew;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter row");
        int r=sc.nextInt();
        System.out.println("enter column");
        int c=sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if((i==0)||(i==r-1)||(j==0)||(j==c-1)){
                    System.out.print("*");
                }else
                    System.out.print(" ");
                }
            
            System.out.println();
        }
        }
        
    }
    

