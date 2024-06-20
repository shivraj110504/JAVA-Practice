package Strings;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        str = str.toLowerCase();
        sc.close();
        System.out.println(str);
    }
}
