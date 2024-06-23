//Take an array as input from the user. Search for a given number x and
//print the index at which it occurs

import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array: ");
        //array input
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number you want to search in array: ");
        int x = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x){
                System.out.println("The number "+x+" occurs at index "+i);
                return;
            }
        }
        System.out.println("This number does not exist in tha array");
    }
}
