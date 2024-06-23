//Write an infinite loop using do while condition

import java.util.*;

public class hw5 {
    public static void infiniteLoop(){
        int n=1;
        do {
            System.out.println("This is an infinite loop");
        }
        while (n>=1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        infiniteLoop();
    }
}


//Alternate

/*
 do {

    }
while(true);


 */