package javanew;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int digit=0;
         int sum=0;
        System.out.println("ENTER THE NUMBER");
        int number=sc.nextInt();
        while(number > 0)  
{  
    digit = number % 10;  
    sum = sum + digit;  
    number = number / 10;  
} 
        System.out.println("Sum of Digits: "+sum);  
}  
}
