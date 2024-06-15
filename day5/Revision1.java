// Online Java Compiler
// Use this editor to write, compile and run your Java code online

package day5;

class Revision1 {
    public static void main(String[] args) {
        
        int temp=0;
        int arr[] = {3,2,5,4,6,10};
        
        int minIndex = 0;
        
        System.out.println("before sorting : ");
        
        for(int x : arr){
            System.out.print(x + " ");
        }
       
        System.out.println();
        System.out.println("------------------");
        
        for(int i=0;i< arr.length;i++){
            minIndex = i;
            System.out.println("---------------------");
            System.out.println("ITERATION " + (i+1));
            for(int j = i+1; j < arr.length; j++){
                
                
                if( arr[minIndex] > arr[j])
                {
                    System.out.println("yes new min number " + arr[j] );
                    minIndex = j;
                }
                // System.out.print(minIndex + " ");
                
                              
            }
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            System.out.println("After " + (i+1) + " iteration the list : ");
            for(int x : arr){
                    System.out.print(x + " ");
             }
            System.out.println();
        }
        
        System.out.println("---------------------- ");
        
        System.out.println("After sorting : ");
        
        for(int x : arr){
            System.out.print(x + " ");
        }
       
       
    }
}