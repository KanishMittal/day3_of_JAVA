//Take an array of names as input from the user and print them on the screen

import java.util.*;

public class hw9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        // consume the newline character left by nextInt()
        sc.nextLine();
        String[] name = new String[size];
        // array inputs
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            name[i] = sc.nextLine();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(name[i]+" ");
        }
    }
}
