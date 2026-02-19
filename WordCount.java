import java.util.Scanner;
class WordCount{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = in.nextInt();
        int prod;

        for(int i=1; i<=10; i++){
            prod = n*i;
            System.out.println(n +" * "+i+" = "+prod );      
        }
    }
}