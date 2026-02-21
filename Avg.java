import java.util.Scanner;
class Avg{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter array length:");
        int n = in.nextInt();

        int[] arr= new int[n];
        int sum=0;


        System.out.println("Enter n numbers:");

        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
            sum += arr[i];

        }
        double average = (double)sum/n;
        System.out.println("Average of the numbers : "+average);
        in.close();
        
    }
    
}