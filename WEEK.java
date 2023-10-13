package javanew;

import java.util.Scanner;

public class WEEK {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         System.out.println("ENTER THE WEEKDAY");
         String str= sc.nextLine(); 
         switch(str){

            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
            {System.out.println("IT IS A WEEKDAY");}
            case "saturday":
            case "sunday":
            {System.out.println("IT IS A WEEK END DAY");}

             }
    }
    
}
