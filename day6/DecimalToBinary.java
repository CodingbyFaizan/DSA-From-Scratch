package day6;

public class DecimalToBinary {

    public static void decToBin(int n){

        int temp = n;

        int pow =0;
        int bin = 0;
        int rem = 0;

        while(n>0){
            rem = n % 2;
            bin  = bin + ( rem * (int) Math.pow(10, pow));
            pow++;
            n = n/2;
        }
        System.out.println("Binary Format of : " + temp + " is " + bin);

    }
    public static void main(String[] args) {
        
        decToBin(12);

    }
}
