import java.util.*;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter a number(1,2,3,4,5)");
        char op = sc.next().charAt(0);
        switch (op) {
            case '1':
                System.out.println(a + b);
                break;
            case '2':
                System.out.println(a - b);
                break;
            case '3':
                System.out.println(a * b);
                break;
            case '4':
                System.out.println(a / b);
                break;
            case '5':
                System.out.println(a % b);
                break;

            default:
                System.out.println("Invalid");

        }

    }
}
