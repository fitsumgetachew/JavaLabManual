import java.util.Scanner;

public class lab2 {
    // Write a programme to generate prime number between M to N.
    public static void generate_prime(int n, int m) {

        for (int i = n; i <= m; i++) {
            for (int j = 3; j <= i / 2; j++) {
                if (i % j == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    // Write a programme to check whether the number is perfect or not?

    public static void check_perfect_number(int num) {
        int temp = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                temp += i;

            }
        }
        if (temp == num) {
            System.out.println(num + " is perfect number");

        } else {
            System.out.println(num + " is NOT perfect number");
        }

    }

    // Write a program to print N elements in array.
    public static void Print_array() {

        int arrays[] = { 3, 35, 45, 23, 53 };

        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);

        }

    }

    // WAP to multiply two numbers using Command line argument.
    public static int multiply_numbers(int num1, int num2) {

        return (num1 * num2);

    }

    // WAP to perform all arithmetic operation using user input.
    public static void calculator() {

        Scanner obj = new Scanner(System.in);
        System.out.println("please Enter first number");

        int n1 = obj.nextInt();
        System.out.println("please Enter operator ");

        char c = obj.next().charAt(0);

        System.out.println("please Enter second number");
        int n2 = obj.nextInt();

        switch (c) {
            case '+':
                System.out.println(n1 + n2);

                break;
            case '-':
                System.out.println(n1 - n2);

                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                System.out.println(n1 / n2);
                break;
            case '%':
                System.out.println(n1 % n2);
                break;
            default:
                System.out.println("Invalid opperator");
                break;
        }

    }

    public static void main(String[] args) {

        Scanner obj1 = new Scanner(System.in);
        int choice;
        while (true) {

            System.out.println(
                    "\n\n\nlab 2 MENU \n 1   :  Generate prime number \n 2   :  check if the number is perfect");
            System.out.println(
                    " 3   :  print array element  \n 4   :  multiply two number  \n 5   :  calculator \n 6   :  Exit");

            System.out.println("Plese enter your choice : ");

            choice = obj1.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("please enter minimum number");
                    int min = obj1.nextInt();
                    System.out.println("please enter Maximum number");
                    int max = obj1.nextInt();
                    generate_prime(min, max);
                    break;
                case 2:
                    System.out.println("plese enter number");
                    int per_num = obj1.nextInt();
                    check_perfect_number(per_num);
                    break;
                case 3:
                    Print_array();
                case 4:

                    System.out.println("please Enter first number");

                    int num1 = obj1.nextInt();

                    System.out.println("please Enter second number");
                    int num2 = obj1.nextInt();
                    multiply_numbers(num1, num2);
                    break;

                case 5:

                    calculator();
                    break;

                case 6:
                    System.out.println("exiting the system ");

                    System.exit(0);

                default:
                    System.out.println("invalid choice");
                    break;
            }
        }

    }
}
