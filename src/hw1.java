//Enter 3 numbers from the user & make a function to print their average.

import java.util.*;

public class hw1 {
    public static int printAverage(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(printAverage(a, b, c));
    }
}
