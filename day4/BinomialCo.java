package day4;

import java.util.Scanner;

public class BinomialCo {

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

    public static int calculateBinomial(int n, int r){

        int fact_n = findFactorial(n);
        int fact_r = findFactorial(r);
        int fact_nr = findFactorial(n-r);
        int res = fact_n / (fact_r * fact_nr);

        return res;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for n : ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter the value for r : ");
        int r = sc.nextInt();


        System.out.println(calculateBinomial(n, r));

        sc.close();

    }
}
