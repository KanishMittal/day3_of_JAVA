//Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;

public class hw2 {
    public static void printOddSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.print("The sum of all odd numbers from 1 to " + n + " is " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printOddSum(n);
    }
}
