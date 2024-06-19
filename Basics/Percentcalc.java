package Basics;

import java.util.Scanner;

public class Percentcalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total marks (ex: 100) :");
        int total_marks = sc.nextInt();
        System.out.println("Enter the marks of 1st subject :");
        int a = sc.nextInt();
        System.out.println("Enter the marks of of 2nd subject:");
        int b = sc.nextInt();
        System.out.println("Enter the marks of 3rd subject:");
        int c = sc.nextInt();
        System.out.println("Enter the marks of of 4th subject:");
        int d = sc.nextInt();
        System.out.println("Enter the marks of 5th subject:");
        int e = sc.nextInt();
        sc.close();

        float sum = a + b + c + d + e;
        float per = sum / (5 * total_marks) * 100 ;
        System.out.printf("Your percentage is %f:",per);
        System.out.println("\n");

    }
}
