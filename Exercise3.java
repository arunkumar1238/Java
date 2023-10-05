// Write a function which takes in 2 numbers and returns the greater of those two.


import java.util.*;

public class Exercise3 {
    public static int getgreater(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(getgreater(a, b));
    }
}