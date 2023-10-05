// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.



import java.util.*;

public class Exercise5 {
    public static boolean eligibletovote(int age) {
        if (age > 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        System.out.println(eligibletovote(age));
    }
}