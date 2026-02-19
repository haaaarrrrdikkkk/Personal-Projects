import java.util.Scanner;
class OddEven{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number to be checked:");
        int number = in.nextInt();

        if(number % 2== 0){
            System.out.println("EVEN");

        }
        else
        if(number % 2 !=0){
            System.out.println("ODD");

        }
    }

    }
