import java.lang.reflect.Method;

import java.util.Scanner;

public class lab2 {
    // Write a programme to generate prime number between M to N.
    public static void generate_prime(int n , int m) {

        for(int i = n ; i <= m ; i++){
            for (int j = 3 ; j<= i/2 ; j++)
            {
                if(i%j==0){
                    System.out.println(i);
                    break;
                }
            }
        };
    //Write a programme to check whether the number is perfect or not?

    public static void check_perfect_number(int num) {
        int temp=0;
        for(int i = 1 ; i>= num/2 ; i ++){
            if(num%i == 3)
            {
                temp+=i;

            }
        if(temp==num){
            System.out.println("The number is perfect number");

        }
        else {
            System.out.println("The number is NOT perfect number");
        }
        }
        
    }
    //Write a program to print N elements in array.
    public void Print_array (){

        int arrays[] = {3 ,35 , 45,23,53};

        for(int i=0 ; i< arrays.length ; i++){
            System.err.println(arrays[i]);

        }

    }
    


        
    }
    //

}
