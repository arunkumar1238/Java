// Take an array of numbers as input and check if it is an array sorted in ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//        {3, 4, 6, 2} is not sorted in ascending order.



import java.util.*;

public class ArraysHW3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        boolean IsAscending = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                IsAscending = false;
            }
        }
        if (IsAscending) {
            System.out.println("The Array is Sorted in Ascending order.");
        } else {
            System.out.println("The Array is not Sorted in Ascending order.");
        }
    }
}