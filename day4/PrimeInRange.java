package day4;

import java.util.Scanner;

public class PrimeInRange {

    public static boolean checkPrime(int n){

        if(n==2){
            return true;
        }

        for(int i = 2; i<=n/2 ; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;

    }

    public static void primeInRange(int n){

        for(int i=2; i<=n; i++){
            if(checkPrime(i) == true)
                System.out.print(i + " ");
        }

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range : ");
        int n = sc.nextInt();

        primeInRange(n);

        sc.close();
    }
}
