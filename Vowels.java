import java.util.Scanner;
class Vowels{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word =in.nextLine();
        int l = word.length();
        int count = 0;

        for(int i=0; i <l-1;i++){
            char check = word.charAt(i);
            if(check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u' || check == 'A' || check == 'E' || check == 'I' || check == 'O' || check == 'U'){
                count++;
            }
        }
        System.out.println("Number of vowels in the word is: " + count);
        in.close();
    }
}
