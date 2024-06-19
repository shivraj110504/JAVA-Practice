package Basics;

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the Kilometter :");
        int km = sc.nextInt();
        sc.close();

        float result = km * 0.621371f;

        System.out.printf("%d km to miles is %f", km, result);
    }
}
