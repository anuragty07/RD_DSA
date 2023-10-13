package javanew;

import java.util.Scanner;

public class TRAFFIC {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE COLOR");
        String a=sc.nextLine();
        switch(a){
            case "red":
            case "green":
            {
                System.out.println("next colour is yellow");
                break;
    
            }
    
            case "yellow":
            {
                System.out.println("next color can be red or green");
                break;
            }
            default:
            {
                System.out.println("invalid input");
            }
    
            }
    }
    
}
