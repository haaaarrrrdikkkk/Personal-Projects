import java.util.Scanner;

class PalindromeNo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number to be checked: ");
        int n= in.nextInt();
        int reverse= 0;
        int original =n;

        while(n<0){
            int digit = n%10;
            reverse = reverse * 10+ digit;
            n=n/10;

        }
        if(original == reverse){
            System.out.println("Palindrome Number!");

        }
        else{
            System.out.println("Not a Palindrome Number!");
            
        }
    }
}