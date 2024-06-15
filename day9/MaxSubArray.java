package day9;

public class MaxSubArray {
    
    public static void main(String[] args) {
        
        int arr[] = {2,4,6,8,10};
        maxSubArray(arr);

    }

    public static void maxSubArray(int arr[]){

        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        int currentMinSum = 0;
        int currentSum = 0;

        for(int i = 0;i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                currentMinSum = 0;
                currentSum = 0;
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                    currentMinSum +=arr[k];
                    currentSum += arr[k];
                }
                System.out.println("Current sum : " + currentSum);
                    if(currentSum > maxSum)
                        maxSum = currentSum;
                    if(currentMinSum < minSum){
                        minSum = currentMinSum;
                    }
            }
        }
        System.out.println("Max sum : " + maxSum);
        System.out.println("Min Sum : " + minSum);

    }

}
