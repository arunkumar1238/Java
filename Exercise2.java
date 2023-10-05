// Write a function to print the sum of all odd numbers from 1 to n.


import java.util.*;

public class Exercise2 {
    public static void printsum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 1) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printsum(n);
    }
}
