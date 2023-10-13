package javanew;

import java.util.Scanner;

public class SEASON {
    public static void main(String[] args) {
         System.out.println("Enter any month(1 to 12)");
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
      switch (n)
        {
            case 12:
            case 1:
            case 2:
            System.out.println("The entered month is in the winter ");
            break;
            case 3:
            case 4:
            case 5:
            System.out.println("The entered month is in the spring ");
            break;
            case 6:
            case 7:
            case 8:
            System.out.println("The entered month is in the summer ");
            break;
            case 9:
            case 10:
            case 11:
            System.out.println("The entered month is in the autumn ");
            break;
            default:
            System.out.println("INVALID MONTH");
    }
    
}
}