package day4;

import java.util.Scanner;

public class FactorialFinder {
    
    public static int findFactorial(int n ){

        int fact = 1;

        if(n == 1){
            return 1;
        }

        if(n == 2){
            return 2;
        }

        for(int i = 1; i<=n ; i++){
            fact *= i;
        }

        return fact;
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial : ");

        int n = sc.nextInt();

        System.out.println("Factorial :  " + findFactorial(n));

        sc.close();

    }

}
