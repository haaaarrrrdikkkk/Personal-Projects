import java.util.Scanner;
    class SumofElements{
    public static void main(String[] args){
         
         Scanner in = new Scanner(System.in);
         System.out.println("ENter the size of the array: ");
         int size = in.nextInt();

        
        int[] arr= new int[size];
        for(int i = 0; i<size; i++){
            arr[i] =in.nextInt();
        }
            int sum = 0;
            for(int j =0; j<size; j++){
                sum += arr[j];

            }  
         System.out.println("Sum of the digits of the array: "+ sum);
         in.close();
        }   
    }

