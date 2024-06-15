
public class PairsInArray {

    public static void findingPair(int arr[]){

        int totalNoOfPairs = 0;
        for(int i=0; i<arr.length-1; i++){
            
            for(int j=i+1;j<arr.length; j++){
                System.out.print(" ( " + arr[i] + " , " + arr[j] + " ) " );
                totalNoOfPairs++;
            }
            System.out.println();
        }
        System.out.println("Total No of Pairs : " + totalNoOfPairs);

    }
    public static void main(String[] args) {
        
        int arr[] = { 2,4,6,8,10};
        findingPair(arr);

    }
}
