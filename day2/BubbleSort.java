package day2;

public class BubbleSort {
    public static void main(String[] args) {
        
        int arr[] = { 10,5,7,2,6,9};
        int size = arr.length;
        int temp = 0;

        System.out.println("Before sorting");
        for(int num : arr){
            System.out.print(num + " ");
        }

        for(int i=0; i<size-1; i++){
            for(int j=0; j<size-1-i; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println();

        System.out.println("After sorting");
        for(int num : arr){
            System.out.print(num + " ");
        }

    }
}
