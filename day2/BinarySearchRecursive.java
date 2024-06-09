package day2;

public class BinarySearchRecursive {
    
    public static void main(String[] args) {
        
    int arr[] = {2,4,6,8,10};
    int target = 11;

    int result = binarySearch(arr,target,0,arr.length-1);

    if(result == -1)
        System.out.println("Element not found");
    else{
        System.out.println("Element : " + target + " found at " + result);
    }

    }

    public static int binarySearch(int arr[],int target, int left , int right){

        int mid = 0;

        if(left<=right){
            mid = (left + right) / 2;
        
        if(arr[mid] == target)
            return mid;

        else if( target > mid) {
            return binarySearch(arr, target, mid + 1, right);
        }
        else {
            return binarySearch(arr, target, left, mid -1);
        }
    }
        return -1;

    }
}




