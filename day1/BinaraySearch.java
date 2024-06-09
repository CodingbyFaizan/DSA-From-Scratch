package day1;


// Best case
    // if the element found at the mid position O(1)

// Worst Case 
    // O(log n)

public class BinaraySearch {
    
    public static void main(String[] args) {
        
        int arr[] = new int[32];
        int target = 32;
        int count = 0;

        int result = binarySearch(arr,target,count);

        if(result == -1)
            System.out.println("Element not found");
        else{
            System.out.println("Element : " + target + " found at " + result);
        }

     }

     public static int binarySearch(int arr[],int target,int count){

        int left = 0;
        int right = arr.length - 1;
        int mid;

        while(left <= right){
            count++;
            mid = (left + right) / 2;

            if(arr[mid] == target)
            {
                System.out.println("Steps taken : " + count);
                return mid ;
            }

            if(target > mid){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        System.out.println(count);
        return -1;

     }

}
