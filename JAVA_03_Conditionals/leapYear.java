package JAVA_03_Conditionals;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Year");
        int x = sc.nextInt();
        sc.close();
        float y = x % 4;
        if (y == 0) {
            System.out.println("Leap year");
        }else{
            System.out.println("not a leap Year");
        }

    }
}
