package JAVA_03_Conditionals;

import java.util.Scanner;


public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your income");
        float income = sc.nextInt();
        sc.close();

        float tax = 0;
        if (income < 250000) {
            tax = tax + 0;
        }else if (income > 250000 && income <= 500000) {
            tax = tax + 0.05f * (income-25000);
            income = income - tax;
            System.out.println(income);
        }else if (income > 500000 && income <= 1000000) {
            tax = tax +0.2f * (1000000 - income);
            tax = tax + 0.05f * (500000 - 250000);
            income = income - tax;
            System.out.println(income);
        }else if (income > 1000000) {
            tax = tax +0.2f * (1000000 - 500000);
            tax = tax + 0.05f  * (500000 - 250000);
            tax = tax + 0.3f * (income - 1000000);
            income = income - tax;
            System.out.println(income);
        }
        System.out.println("tax paid by you is " + tax);
    }
}
