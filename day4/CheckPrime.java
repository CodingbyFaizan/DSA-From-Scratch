package day4;

import java.util.Scanner;

public class CheckPrime {

    public static boolean checkPrime(int n){

        if(n==2){
            return true;
        }

        for(int i = 2; i<n/2 ; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        boolean flag = checkPrime(n);

        if(flag == true){
            System.out.println(n + " is a prime number");
        }
        else{
            System.out.println(n + " is not a prime number");
        }

        sc.close();
    }
}
