package day7;


// Two pointer variable which will swap elements 

public class ReverseArray {

    public static void reverse(int arr[]){
        
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for(int x : arr){
            System.out.print( x + " ");
        }

    }
    public static void main(String[] args) {
        
        int arr[] = { 4,3,2,1};

        reverse(arr);

    } 
}
