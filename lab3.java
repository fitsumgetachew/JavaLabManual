import java.util.Scanner;
public class lab3 {
    /*WAP to test whether the number is palindrome or not */
    public boolean check_palindrome(int num) {

        int temp = num;
        int rem = 0;
        int reverse = 0;
        while (temp!=0) {
            rem = temp%10;
            reverse = rem + 10*reverse;
            temp = temp/10;      
        }
        
        if (temp == num){
            return true;
        }
        else{
            return false;
        }   
    }
    /* */
}
