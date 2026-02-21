import java.util.Scanner;
class SmallestNo{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = in.nextInt();
         
        int[] arr= new int[size];

        System.out.println("Enter the elements of the array:");


        for (int i= 0; i<size ; i++) {
            arr[i] = in.nextInt(); 
        }
        int smallest = arr[0];

        for(int j= 1; j<size; j++){
            if(arr[j]> smallest){
                smallest = arr[j];

            }
            System.out.println("Samllest Number: "+smallest);


        }
        in.close();
        } 
    }
    

