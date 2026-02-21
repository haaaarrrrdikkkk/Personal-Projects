import java.util.Scanner;
class RemSp{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter strring to remove spaces: ");
        String sentence = in.nextLine();

        String result = "";

        for(int i = 0; i< sentence.length(); i++){
            char ch = word.charAt(i);

        }
        if(charAt(i) == ' '){
            result = result+ ch;

        }
        System.out.println("Sentence without spaces :"+ result);

        in.close();
    }
}
