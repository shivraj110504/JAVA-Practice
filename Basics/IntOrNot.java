package Basics;

import java.util.Scanner;

public class IntOrNot {
    public static void main(String[] args) {
        System.out.println("enter the number :");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
        sc.close();
    }
}
