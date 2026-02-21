import java.util.Scanner;
 class Armstrong{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Number to be checked: ");
        int n = in.nextInt();

        int digit ;
        int prod= 0;

        while(n>0){
            digit = n%10;
            prod = prod+(digit*digit*digit);
            n =n /10;   
        }
        if(n == prod){
            System.out.println("Armstrong number");

        }
        else{ 
        System.out.println("Not Armstrong number");
        }
        in.close();
    }
 }

