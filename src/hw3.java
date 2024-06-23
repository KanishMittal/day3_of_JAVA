//Write a function which takes in 2 numbers and returns the greater of
//those two.

import java.util.*;

public class hw3 {
    public static void greaterOfTwo(int a, int b) {
        if (a > b)
            System.out.println(a + " is greater than " + b);
        else
            System.out.println(b + " is greater than " + a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        greaterOfTwo(a, b);
    }
}
