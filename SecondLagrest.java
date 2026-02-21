import java.util.Scanner;
class SecondLargest{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size= in.nextInt();

        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            System.out.println("Enter the elements of the array: ");
            arr[i]= in.nextInt();
        }

        int largest = arr[0];
        int secondLargest = arr[0];

        for(int i=0; i<size; i++){
                if(arr[i] > largest){
                    secondLargest = largest;
                    largest = arr[i];

                }
                else 
                if((arr[i]> secondLargest) && (arr[i] != largest)) {
                    secondLargest = arr[i];

                }
        }
        System.out.println("2nd Largest: "+ secondLargest);

    }
    
}