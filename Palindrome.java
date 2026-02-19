import java.util.Scanner;
class Palindrome{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = in.nextLine();

        int length = word.length();
        boolean isPalindrome = true;

        for(int i = 0; i< length/2;i++){
            if(word.charAt(i)!= word.charAt(length-1-i)){
                isPalindrome = false;

                break;

            }
        }
        if(isPalindrome)
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindorme");
        
    }
}