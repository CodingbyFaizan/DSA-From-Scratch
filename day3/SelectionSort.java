package day3;

public class SelectionSort {
    
    public static void main(String[] args) {
        
        int arr[] = { 10,9,6,7,2,4,3};

        int temp = 0;
        int size = arr.length;
        int maxIndex = arr.length-1;
        int j;

        System.out.println(arr.length);
        System.out.println("Current min index : " + arr[maxIndex]);

        System.out.println("Before sorting");

        for(int num : arr){
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.println();


        // Logic for Selection Sort

        // for(int i=0;i<size-1;i++){

        //     for(j=i+1; j < size ;j++){
        //         if( arr[j] < arr[maxIndex]){
        //             maxIndex = j;
        //         }
        //     }
        //     System.out.println();

        //     temp = arr[i];
        //     arr[i] = arr[maxIndex];
        //     arr[maxIndex] = temp;

        // }


        for(int i=size-1; i >= 0; i--){

            for(j=i-1; j >= 0 ;j--){
                if( arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }
            System.out.println();

            temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;

        }

        // ends here

        System.out.println();
        System.out.println();
        System.out.println("After sorting");

        for(int num : arr){
            System.out.print(num + " ");
        }

    }

}
