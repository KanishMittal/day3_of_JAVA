//Two numbers are entered by the user, x and n. Write a function to find
//the value of one number raised to the power of another i.e. x^n.

import java.util.*;

public class hw7 {
    public static void power(int x, int n) {
        int answer = 1;
        for (int i = 1; i <= n; i++) {
            answer= answer * x;
        }
        System.out.print("The value of one number raised to the power of another is: " + answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        power(x, n);
    }
}
