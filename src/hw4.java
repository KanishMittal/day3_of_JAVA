//Write a function that takes in the radius as input and returns the
//circumference of a circle.

import java.util.*;

public class hw4 {
    public static void printCircumference(int r){
        double circumference = 2*3.14*r;
        System.out.print("The circumference of circle is: "+circumference+" units");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int r = sc.nextInt();
        printCircumference(r);
    }
}
