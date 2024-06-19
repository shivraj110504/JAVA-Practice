package Basics;

import java.util.Scanner;

public class FirstCode {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        sc.close();

        int sum = a + b;
        System.out.println("The sum is :");
        System.out.println(sum);
    }
}
