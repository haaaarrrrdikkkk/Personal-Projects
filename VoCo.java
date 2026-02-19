import java.util.Scanner;
class VoCo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word =in.nextLine();

        int l = word.length();
        word = word.toLowerCase();

        int vowels=0;
        int consonants=0; 
        for(int i=0; i< l;i++){
            char ch= word.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }
            else 
            consonants++;

            }
            System.out.println("Number of vowels in the word is: " + vowels);
            System.out.println("Number of consonants in the word is: " + consonants);

        }
    }