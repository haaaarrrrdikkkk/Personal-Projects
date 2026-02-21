import java.util.Scanner;
class FactorialNo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = in.nextInt();

        int prod = 1;
        for(int i=1; i<=n; i++){
            prod *= i;

        }
        System.out.println("Factorial: "+ prod);

    }
}