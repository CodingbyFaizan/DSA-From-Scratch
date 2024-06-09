package day1;

// Best case
    // if the element found at the first position O(1)

// Worst Case 
    // if the element present at last position or not exist in the list O(n)

public class LinearSearch{

     public static void main(String[] args) {
        
        int arr[] = { 2,4,6,8,10};
        int target = 8;

        int result = linearSearch(arr,target);

        System.out.println("Element : " + target + " found at " + result);

     }

     public static int linearSearch(int arr[],int target){

        int count = 0;
        for(int i = 0; i<arr.length; i++){
            count ++;
            if(arr[i] == target){
                System.out.println(count);
                return i;
            }
            // count++;
        }

        System.out.println(count);
        return -1;
     }

}