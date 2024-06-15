package day9;
public class PrefixArray {
    
    public static void maxSubArrayUsingPrefix(int arr[]){

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for(int i=1;i<arr.length; i++){
            
            prefix[i] = prefix[i-1] + arr[i];
            System.out.print(prefix[i-1] + " + " + arr[i] + " : " + prefix[i]);
            System.out.println();
        }

        for(int i=0;i<arr.length;i++){
            currentSum = 0;
            for(int j=i;j<arr.length;j++){
                currentSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
            }
            if(currentSum > maxSum)
                maxSum = currentSum;
        }

        System.out.println("Max Sum : " + maxSum);

    }
    public static void main(String[] args) {

        int arr[] = { 2,4,6,8,10};
        maxSubArrayUsingPrefix(arr);

    }

}
