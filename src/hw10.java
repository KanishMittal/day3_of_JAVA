//Find the maximum & minimum number in an array of integers.

import java.util.*;

public class hw10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            if(arr[i] < min)
                min = arr[i];
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: "+ min);
    }
}
