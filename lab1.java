import java.util.Scanner;
import java.lang.Math;

public class lab1 {
    // sum of two number
    public static int sum(int x, int y) {
        return x + y;
    }

    // area of circle
    public static double area_of_circle(int r) {
        double area;
        area = 3.14 * Math.pow(r, 2);
        return area;
    }

    // Write a java programme print 10 to 1 using loop.
    public static void loopNumbers(int n) {

        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }

    // Write a java programme to check the inputted number is prime or not.
    public static boolean check_prime(int n) {

        boolean check = false;

        if (n > 2) {
            for (int i = 3; i <= n / 2; i++) {

                if (n % i == 0) {
                    check = true;
                }
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Hello World!");

        System.out.println("Please Enter two number : ");

        int num1 = myObj.nextInt();
        int num2 = myObj.nextInt();

        System.out.println("sum of two numer is " + sum(num1, num2));

        System.out.println("Please Enter radius of circle : ");

        int rad = myObj.nextInt();

        System.out.println("Area of the circle is : " + area_of_circle(rad));

        System.out.println("Please Enter last element of the loop : ");

        int num = myObj.nextInt();

        loopNumbers(num);
        System.out.println("Please Enter a number to check if it is prime or not");
        int check = myObj.nextInt();

        if (check_prime(check)) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
    }

}