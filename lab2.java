import java.lang.reflect.Method;

import java.util.Scanner;
public class lab2 {
    //Write a programme to generate prime number between M to N.
    public void generate_prime(int n , int m) {

        for(int i = n ; i <= m ; i++){
            for (int j = 0 ; j<= i/2 ; j++)
            {
                if(i%j==0){
                    System.out.println(i);
                    break;
                }
            }
        }
    //Write a programme to check whether the number is perfect or not?


        
    }
    //


    
}
