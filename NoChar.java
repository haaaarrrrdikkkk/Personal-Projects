import java.util.Scanner;
class NoChar{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = in.nextLine();
        char check =in.next().charAt(0);
        int length = word.length();

        int counter = 0;

        for(int i=0; i<length; i++){
            char c = word.charAt(i);
            if(c== check){
                counter++;

            }
            
            
        }
        System.out.println("Number of times the given character is used: "+counter );
    }
}
