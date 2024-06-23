import java.util.*;

//Main class
public class Factorial {
    //Factorial Function
    public static void printFactorial(int n) {
        if (n < 0) {
            System.out.print("Invalid Input");
            return;
        }
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.print("The factorial of " + n + " is " + fact);
    }

    //Main Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);  //function call
    }
}
