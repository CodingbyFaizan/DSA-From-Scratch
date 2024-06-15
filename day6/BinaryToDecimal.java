package day6;

public class BinaryToDecimal {
    
    public static void covertToDecimal(int binary){
        int temp =binary;

        int pow = 0;
        int decimal =0;
        int ld = 0;

        while(binary > 0){
            ld = binary % 10;
            decimal = decimal + (int)( ld * Math.pow(2, pow));
            pow++;
            binary = binary/10;
        }
        System.out.println("Decimal of  : " + temp + " is : " + decimal);
    }


    public static void main(String[] args) {
        
        covertToDecimal(10010011);
        

    }

}
